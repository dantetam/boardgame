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

def myOwnTextWrapper(txt, x, y, width, padding, fontSize):
    cursorX = x + padding
    cursorY = y + padding
    tokens = txt.split()
    i = 0
    while i < len(tokens):
        wordOffset = (len(tokens[i]) + 1)*fontSize*0.353/2
        if cursorX + wordOffset - x > width - padding:
            cursorX = x + padding
            cursorY = cursorY + fontSize/2
        pdf.text(cursorX, cursorY, tokens[i])
        cursorX = cursorX + wordOffset
        if cursorX - x > width - padding:
            cursorX = x + padding
            cursorY = cursorY + fontSize/2
        i = i + 1

def readSeparatedCardFile(cardFilePath):
    results = []
    with open(cardFilePath) as f:
        lines = f.readlines()
        for line in lines:
            tokens = line.split("|")
            convertToFloat = lambda token: float(token) if token.isnumeric() else token
            tokens = [convertToFloat(token) for token in tokens]
            results.append(tokens)
    return results

def drawCards(cardFilePath):
    cards = readSeparatedCardFile(cardFilePath)
    while True:
        pdf.add_page()
        for j in range(4):
            for i in range(3):
                if len(cards) == 0: return
                curCard = cards[0]
                while curCard[1] <= 0:
                    if len(cards) == 1: return
                    cards.pop(0)
                    curCard = cards[0]
                curCard[1] = curCard[1] - 1

                x = i*cardWidth + 12
                y = j*cardHeight + 15
                padding = 3
                pdf.text(x + padding, y + padding,curCard[0])
                #pdf.text(x,y+6,"Test2")
                myOwnTextWrapper(curCard[2], x, y+globalFontSize, cardWidth, padding, 12)
                wrap = 1 if i==2 else 0
                pdf.cell(cardWidth, cardHeight, txt = "", ln = wrap, align = 'L', border = 1)



pdf = FPDF()
pdf.set_font("Courier", size = globalFontSize)

drawCards("./src/python-card-printer/separated-card-rows.txt")

pdf.output("cards.pdf")
