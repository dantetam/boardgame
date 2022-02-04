# Board Game Nights Meetup

The official board game of the Board Game Nights Meetup Group! 

## Rules:

Order of play: draw card, use items or play card

Each player has a separate inventory where they may store item cards.

In community mode, community cards are shared by the whole group. These are where the cards are played from.

In individual mode, each player starts the game by drawing five cards.

Every player is assigned a number. This number determines turn order. It also determines random dice. 
Each player starts with 3 health points (HP). The maximum limit is 7 HP.
At the start of your turn you must draw a card. If there are no cards left, you lose 1 HP.

Every turn you can eat one item and must play one card. If you cannot play a card, you die.
Players go in order, determined randomly. A "turn" is when all players do their actions (or lack of actions).
Once a card is played, discarded, or destroyed by effect, it goes to the graveyard.

A player dies when they reach zero HP. They are now dead. Dead players cannot play cards or draw, but keep their items and any old effects may still activate. Dead players may still vote. Dead players cannot be chosen for "random plrs" or "other plrs". Dead players keep their items.
  Being dead is different than losing. Dead players may still win, but it's much harder. Losing is the end state of the game where some people have won the game.

If a dead player is killed again, they are super dead. Alternatively, a player at or below -3 hp is super dead and cannot go below this number. Super dead players may not vote, heal, or come back to life. Super dead players' items are distributed randomly between all non super dead people (roll for each item). 
  Instead, they choose a player to haunt on their turn, which lasts until the game returns to the super dead player. A haunted player super dies when they die.
  
## Advanced Rules  
  
### Retcon
  
Generally, the whole table should enforce rule changes or effects of cards, including chained effects. If a player wishes to retcon an effect that would happen on someone else's turn, they pay 2 HP before enforcing the retcon.

### Arbiter

If two players agree the effect of a card is ambiguous, the "weakest" person in the game makes the decision as the temporary arbiter. Use the criteria below, top to bottom. If there is a tie for a criterion, choose randomly. If no one meets these criteria, choose randomly from all players.

```
Super dead
Dead
Least HP
Least number of items
```

### Reverse

Several cards allow players to reverse the effect of a card. The player reversing must "reverse" at least one attribute of a card, and can reverse all possible ones. The following attributes of a card may be reversed. 

```
All numbers
Any verb except choose
Take/receive : give/send
Look : don't look
Gain : lose
Discard : draw
Die/super die : live
```

## Victory Conditions

The default victory condition that lasts all game on top of other victory cards unless otherwise specified, is that the last player alive wins by themselves. "Victory Condition" cards, when played, are shared across the group. You may fulfill the default and/or new victory condition to win. Once any number of people win, everyone else loses instantly.

House rule: the winners of the last game draw only four cards in individual mode.

## Cards

Action Cards:
The standard cards. Play it, its effect activates, it's destroyed. 
Effects to Explain:
```
You die = You are dead with zero HP
You super die = You are super dead with -3 HP
Rand plr = Choose randomly from alive players. For example, if players 2, 3, and 5 are left, then roll 1-3 inclusive. Roll a 3, the effect applies to player 5.
Mill = Draw until the condition is satisfied, and then shuffle the deck. If the condition is not met and there are no cards left, die.
Deal damage = Includes both kills and loss of HP
Any ability which requires you to look at someone else's hand = May optionally show the whole table the cards you see
```

People Cards:
Like action cards, but they're you! People cards can be held in inventory. :D

Item Cards:
If you take an item card, it may have these effects:

Passive: This effect applies if the card is in your inventory the turns after you receive it.

Curse: Like Passive, but you are forced to activate the ability when possible.

Eat/Use: You may choose to eat the card on the turn you receive this card, or any of your next turns in addition to your turn actions. When you eat the card, it is destroyed, and its eat effect applies.

Send: The effect applies and you choose a player to send the card to.

Instant ____: The word in the blank applies, but now you can do this on any person's turn at any moment.

Place Cards:
Only one place card is active at a time. A place cards when played, is shared by everyone and replaces the old place card if there was one.

## Tech

Inspired by [We Didn't Playtest This at All](https://www.amazon.com/Asmadi-Games-Didnt-Playtest-This/dp/B001N11OI2)!

Please use [this tutorial](https://riptutorial.com/processing/example/31227/using-processing-with-eclipse#example "Using Processing with Eclipse by RIP Tutorial") to set up Processing in a Java IDE like Eclipse. (CC BY-SA 3.0 License)

```
To use Processing in Eclipse, start by creating a new Java project. Then, select File > Import and then choose General > File System to locate the core.jar file. It can be found in PATH_TO_PROCESSING/core/library/ for Windows or /Applications/Processing 3.app/Contents/Java/core/library/ for Mac. Once this is completed, right-click on core.jar and add it to the build path.
```

To run the Python script that generates cards:
```
python src/python-card-printer/main.py
```

## Improvements

Remove hardcoded cards, use a text file
Remove unnecessary build/project files