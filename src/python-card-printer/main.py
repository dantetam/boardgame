# Python program to create
# a pdf file

import os
from fpdf import FPDF


longTestStr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc finibus enim vel leo vulputate vulputate. Nunc in nulla interdum, pharetra tellus ac, facilisis nunc. Suspendisse potenti. Etiam viverra est at pulvinar mollis."
globalFontSize = 10
cardWidth = 63
cardHeight = 63

if os.path.exists("cards.pdf"):
    os.remove("cards.pdf")

def myOwnTextWrapper(txt, x, y, width, fontSize):
    cursorX = x
    cursorY = y
    tokens = txt.split()
    i = 0
    while i < len(tokens):
        wordOffset = (len(tokens[i]))*fontSize/5
        if cursorX + wordOffset - x > width:
            cursorX = x
            cursorY = cursorY + fontSize/2
        pdf.text(cursorX, cursorY, tokens[i])
        cursorX = cursorX + wordOffset
        if cursorX - x > width:
            cursorX = x
            cursorY = cursorY + fontSize/2
        i = i + 1

# save FPDF() class into a
# variable pdf
pdf = FPDF()

# Add a page
pdf.add_page()

# set style and size of font
# that you want in the pdf
pdf.set_font("Courier", size = globalFontSize)

for j in range(4):
    for i in range(3):
        x = i*cardWidth + 12
        y = j*cardHeight + 15
        pdf.text(x,y,"Test")
        #pdf.text(x,y+6,"Test2")
        myOwnTextWrapper(longTestStr, x, y+globalFontSize/2, cardWidth, 12)
        wrap = 1 if i==2 else 0
        pdf.cell(cardWidth, cardHeight, txt = "", ln = wrap, align = 'L', border = 1)

# save the pdf with name .pdf
pdf.output("cards.pdf")
