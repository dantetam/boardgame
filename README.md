# Board Game Nights Meetup

The official board game of the Board Game Nights Meetup Group! 

## Rules:

Community cards are shared by the whole group. Each player has a separate inventory where they may store item cards.

Every player is assigned a number. This number determines turn order. It also determines random dice. 
Each player starts with 3 health points (HP). The limit is 7 HP.
Every turn you can eat one item and play one card.
Players go in order, determined randomly. A "turn" is when all players do their actions (or lack of actions).

A player dies when they reach zero HP. They are now dead. Dead players cannot play cards or draw, but any old effects may still activate. Dead players may still vote. Dead players cannot be chosen for "random plrs" or "other plrs".
  Being dead is different than losing. Dead players may still win, but it's much harder. Losing is the end state of the game where some people have won the game.

If a dead player is killed again, they are super dead. Alternatively, a player at or below -3 hp is super dead and cannot go below this number. Super dead players may not vote, heal, or come back to life. Instead, they choose a player to haunt on their turn.

## Cards

Action Cards:
The standard cards. Play it, its effect activates, it's destroyed. 
Common Effects to Explain:
You die = You are dead with zero HP
You super die = You are super dead with -3 HP
Rand plr = Choose randomly from alive players. For example, if players 2, 3, and 5 are left, then roll 1-3 inclusive. Roll a 3, the effect applies to player 5.

People Cards:
Like action cards, but they're you! :D

Item Cards:
If you take an item card, it may have these effects:

Passive: This effect applies if the card is in your inventory the turns after you receieve it

Eat: You may choose to eat the card when you receive or on your next turn in addition to your turn actions. When you eat the card, it is destroyed, and its eat effect applies.

Place Cards:
Only one place card is active at a time. A place cards when played, is shared by everyone and replaces the old place card if there was one.

## Tech

Please use [this tutorial](https://riptutorial.com/processing/example/31227/using-processing-with-eclipse#example "Using Processing with Eclipse by RIP Tutorial") to set up Processing in a Java IDE like Eclipse. (CC BY-SA 3.0 License)

```
To use Processing in Eclipse, start by creating a new Java project. Then, select File > Import and then choose General > File System to locate the core.jar file. It can be found in PATH_TO_PROCESSING/core/library/ for Windows or /Applications/Processing 3.app/Contents/Java/core/library/ for Mac. Once this is completed, right-click on core.jar and add it to the build path.
```

## Improvements

Remove hardcoded cards, use a text file
Remove unnecessary build/project files