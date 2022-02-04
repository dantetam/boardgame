# Python program to create
# a pdf file

import os
from fpdf import FPDF


if os.path.exists("cards.pdf"):
    os.remove("cards.pdf")

def myOwnTextWrapper(txt, blockSize, fontSize):
    tokens = txt.split()
    while i < len(tokens):


# save FPDF() class into a
# variable pdf
pdf = FPDF()

# Add a page
pdf.add_page()

# set style and size of font
# that you want in the pdf
pdf.set_font("Arial", size = 12)

for j in range(4):
    for i in range(3):
        x = i*63 + 12
        y = j*63 + 15
        pdf.text(x,y,"Test")
        pdf.text(x,y+6,"Test2")
        wrap = 1 if i==2 else 0
        pdf.cell(63, 63, txt = "", ln = wrap, align = 'L', border = 1)

pdf.cell(63, 63, txt = "Card Text", ln = 0, align = 'L', border = 1)

# Add a page
pdf.add_page()

# create a cell
pdf.cell(63, 63, txt = "Top Left Block", ln = 0, align = 'L', border = 1)
pdf.cell(63, 63, txt = "Top Left Block", ln = 0, align = 'L', border = 1)
pdf.cell(63, 63, txt = "Top Left Block", ln = 1, align = 'L', border = 1)

# save the pdf with name .pdf
pdf.output("cards.pdf")
