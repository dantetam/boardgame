package cardcreator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class CardCreator extends PApplet {
	
	public List<Card> cards;
	
	public static void main(String args[]) {
		PApplet.main(new String[] { CardCreator.class.getName() });
	} 
	
	public void settings() {
		size(400,560);
		noLoop();
	}
	
	public void setup() {
		File dir = new java.io.File("./data/output");
		for (File file: dir.listFiles()) 
		    if (!file.isDirectory()) 
		        file.delete();
		
		cards = new ArrayList<>();
		
		//Effect cards
		
		Card card1;
		
		card1 = new Card();
		card1.cardTitle = "Transporter";
		card1.text = "Transfer one item or effect from one player to another.";
		card1.imageUrl = "https://lumiere-a.akamaihd.net/v1/images/transporter1_584x800_49cfdd27.jpeg?region=0%2C0%2C584%2C800";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Charity";
		card1.text = "Transfer one item or effect from one plr to another. Cannot involve you.";
		card1.imageUrl = "inputCardImages/monk.jpg";
		card1.count = 6;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Communism!";
		card1.text = "The plr w/ the most items, if no tie, loses 1 HP and all their items. Other plrs lose first item.";
		card1.imageUrl = "inputCardImages/hammer.png";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Capitalism!";
		card1.text = "Gain 2 HP. The plr w/ most items, if no tie, may take 1 item of their choice. Other plrs lose first item.";
		card1.imageUrl = "inputCardImages/hammer.png";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Um, Actually";
		card1.text = "Choose any card played in the last turn, act like it was never played.";
		card1.imageUrl = "inputCardImages/um_actually.png";
		card1.count = 5;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Damnatio";
		card1.text = "Write down one player's name. On your next turn, they die.";
		card1.imageUrl = "inputCardImages/devil.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Uno Reverse";
		card1.text = "Choose plr. The last card they played also affects them w/ same effect.";
		card1.imageUrl = "inputCardImages/mindcontrol.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "It's Made Out Of";
		card1.text = "Take 1 of your items and turn it into 1 item someone owns. If no one owns items, choose from all items.";
		card1.imageUrl = "inputCardImages/butter.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "I Can't Believe It's Not";
		card1.text = "Take any 1 owned item and turn it into Butter.";
		card1.imageUrl = "inputCardImages/butter.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Murder Mystery";
		card1.text = "Choose random plr. That plr dies.";
		card1.imageUrl = "inputCardImages/death.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Death Link";
		card1.text = "Choose one plr and then a rand plr. If one of these plrs dies, the other one dies.";
		card1.imageUrl = "inputCardImages/death.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Salt Poisoning";
		card1.text = "You die. Choose another plr to die.";
		card1.imageUrl = "inputCardImages/salt.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Bad Mind Control";
		card1.text = "Choose random plr. That plr must play a random card on their next turn.";
		card1.imageUrl = "inputCardImages/mindcontrol.jpg";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Quiplash";
		card1.text = "Choose two random plrs. Choose a prompt. Third party reads. All others vote. Less votes = -1 hp. Quip = death to other plr.";
		card1.imageUrl = "inputCardImages/quiplash.png";
		card1.count = 8;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Price is Not Right";
		card1.text = "Choose purchasable item. Choose two random plrs to guess secret. Use Amazon. Farther price = -1 hp.";
		card1.imageUrl = "inputCardImages/price_is_right.png";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Arsonist";
		card1.text = "Other plrs lose 1 hp per flammable item in inv. Destroy f. items. If no plr has f. items, choose one plr to lose 2 HP.";
		card1.imageUrl = "inputCardImages/arsonist.png";
		card1.count = 8;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Seer";
		card1.text = "Say a word. If a card seen has this word before your next turn, it must be played.";
		card1.imageUrl = "inputCardImages/seer.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Skribbl.io Guessing";
		card1.text = "Draw a picture. 2 other rand plrs to guess. Third party reads. Vote. Less votes = -1 hp. Quip = other plr dies";
		card1.imageUrl = "inputCardImages/skribbl.jpg";
		card1.count = 6;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Skribbl.io Drawing";
		card1.text = "Choose prompt. 2 other rand plrs to draw. Third party shows. Vote. Less votes = -1 hp. Quip = other plr dies";
		card1.imageUrl = "inputCardImages/skribbl.jpg";
		card1.count = 6;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Sound Design Improv";
		card1.text = "Two random players. Choose a sound prompt without words. Vote. Less votes = -1 hp";
		card1.imageUrl = "inputCardImages/yelling.png";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Jeopardy";
		card1.text = "Choose question. 2 other random plrs, 1 buzzes first. -1 hp to if wrong, else -1 hp to other. Die if your answer is wrong.";
		card1.imageUrl = "inputCardImages/jeopardy.jpg";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Randomat";
		card1.text = "Choose 1 Gold or 1 HP. Random effect occurs now: 1) Other plr plays rand card from board. 2) You play rand card.";
		card1.imageUrl = "inputCardImages/randomat.jpg";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Baldur's Bones";
		card1.text = "Two random plrs. Roll d6 until 1st player passes. Loss = -1 hp. Bust = death!";
		card1.imageUrl = "inputCardImages/d20.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Baldur's Dice";
		card1.text = "Choose another random plr. Roll d20+5 and they roll d20. Lower roll, if no tie, dies.";
		card1.imageUrl = "inputCardImages/d20.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "DND Campaign";
		card1.text = "Roll a d20 + number of players alive. -1 hp if lower than 10. Else, choose one plr -2 hp.";
		card1.imageUrl = "inputCardImages/d20.jpg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Shuffle";
		card1.text = "Discard all cards and redraw the same number of cards. End turn.";
		card1.imageUrl = "inputCardImages/deckcards.jpg";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Jester";
		card1.text = "Random plr is jester. The jester will be informed. If this plr dies by someone else's card, they win.";
		card1.imageUrl = "inputCardImages/jester.png";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Executioner";
		card1.text = "Passive: Receive a random target for rest of game. If you kill them with a card, you win.";
		card1.imageUrl = "inputCardImages/jester.png";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Half Even";
		card1.text = "Every even numbered player dies.";
		card1.imageUrl = "inputCardImages/two.png";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Half Odd";
		card1.text = "Every odd numbered player dies.";
		card1.imageUrl = "inputCardImages/three.jpg";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Death";
		card1.text = "You die if you play this card.";
		card1.imageUrl = "inputCardImages/death.jpeg";
		card1.count = 6;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Armaggedon";
		card1.text = "Two random plrs die. Game ends on the end of your next next turn.";
		card1.imageUrl = "inputCardImages/meteor.png";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Demonetized";
		card1.text = "(Passive): Lose one item or one HP at end of turn.";
		card1.imageUrl = "inputCardImages/.png";
		card1.count = 3;
		cards.add(card1);
		
		/*
		card1 = new Card();
		card1.cardTitle = "Among Us";
		card1.text = "One random player is now an impostor. The impostor cannot be killed. However, when attacked, they will be revealed.";
		card1.imageUrl = "inputCardImages/impostor.png";
		card1.count = 2;
		cards.add(card1);
		*/
		
		card1 = new Card();
		card1.cardTitle = "One for you and one for me.";
		card1.text = "You and another plr (that you choose) take a random card from board right now.";
		card1.imageUrl = "inputCardImages/impostor.png";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Among Us Vote";
		card1.text = "You start w/ two votes. Everyone gets one vote in order. Person w/ most votes, if no tie, dies.";
		card1.imageUrl = "inputCardImages/impostor.png";
		card1.count = 4;
		cards.add(card1);
		
		//Victory condition cards
		
		card1 = new Card();
		card1.cardTitle = "Be Humble";
		card1.text = "Every plr without items wins on the end of your next next turn.";
		card1.imageUrl = "inputCardImages/woodenbowl.jpeg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Cornucopia";
		card1.text = "Plrs w/ four food win.";
		card1.imageUrl = "inputCardImages/cornucopia.jpeg";
		card1.count = 2;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Smaug";
		card1.text = "Plrs w/ four gold win.";
		card1.imageUrl = "inputCardImages/gold.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Impostor Win";
		card1.text = "First plr to reach two kills wins.";
		card1.imageUrl = "inputCardImages/impostor.jpg";
		card1.count = 2;
		cards.add(card1);

		//Rule change cards
		
		card1 = new Card();
		card1.cardTitle = "Play Two";
		card1.text = "Every plr plays two cards on the beginning of their turn.";
		card1.imageUrl = "inputCardImages/two_cards.jpg";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Must Play";
		card1.text = "Every player must play on their turn.";
		card1.imageUrl = "inputCardImages/two_cards.jpg";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "You're the Worst";
		card1.text = "Play extra card for yourself. Then, every plr is controlled by the next plr, cycling around. ";
		card1.imageUrl = "inputCardImages/two_cards.jpg";
		card1.count = 2;
		cards.add(card1);
		
		//Place cards
		
		card1 = new Card();
		card1.cardTitle = "San Jose";
		card1.text = "No effects.";
		card1.imageUrl = "inputCardImages/san_jose.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "LA";
		card1.text = "Urban Sprawl: Every full turn (when the first alive plr starts action), one rand plr takes -1 HP.";
		card1.imageUrl = "inputCardImages/los_angeles.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Chicago";
		card1.text = "Deep Dish: Any food item now does double the effect listed in (Eat)";
		card1.imageUrl = "inputCardImages/chicago.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "San Francisco";
		card1.text = "High Cost of Living: You can only have two items. Lose all gold.";
		card1.imageUrl = "inputCardImages/san_francisco.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Discord";
		card1.text = "VR: All items are now 'virtual'. You can never lose them. If someone takes them, they are copied.";
		card1.imageUrl = "inputCardImages/discord.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "The Midwest";
		card1.text = "Spread Out: All numbers are halved. Round down if there's a dispute.";
		card1.imageUrl = "inputCardImages/midwest.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Barovia";
		card1.text = "Vampiric Magic: All numbers (not ordinals) are negative.";
		card1.imageUrl = "inputCardImages/barovia.jpg";
		card1.type = "Place";
		cards.add(card1);
		
		//Items
		
		card1 = new Card();
		card1.cardTitle = "Birthday Cake";
		card1.text = "Eat: Gain two health.";
		card1.imageUrl = "inputCardImages/cake.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Uncrustables";
		card1.text = "Eat: Gain one health.";
		card1.imageUrl = "inputCardImages/uncrustable.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Butter";
		card1.text = "Flammable. Eat: Lose one health.";
		card1.imageUrl = "inputCardImages/butter.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Energy Drink";
		card1.text = "Eat: Lose one health. Take an extra turn.";
		card1.imageUrl = "inputCardImages/energydrink.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Vengeful Shadow";
		card1.text = "On Death: Choose another plr. They can lose either 2 HP, or one item of your choice.";
		card1.imageUrl = "inputCardImages/shadow.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Vicious Cycle";
		card1.text = "Send: Deal -1 HP to another plr, that plr then receives this card.";
		card1.imageUrl = "inputCardImages/shadow.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Trap Hole";
		card1.text = "A random card (after this one is played) is now trapped. Playing the trapped card = -2 HP.";
		card1.imageUrl = "";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Beer Fund Tax";
		card1.text = "Every other plr must lose 1 Gold, or 1 Beer. Otherwise, lose -1 HP.";
		card1.imageUrl = "";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Generous Gift";
		card1.text = "You must give another plr one of your items. Next turn, you may play two cards.";
		card1.imageUrl = "";
		card1.count = 5;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Gold";
		card1.text = "It's a pile of gold coins.";
		card1.imageUrl = "inputCardImages/gold.jpg";
		card1.count = 16;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Weighted d20";
		card1.text = "Nat 1 again?";
		card1.imageUrl = "inputCardImages/d20.jpg";
		card1.count = 3;
		cards.add(card1);

		card1 = new Card();
		card1.cardTitle = "Lagunitas Beer";
		card1.text = "Official beer of the meetup group! Flammable. Eat: Gain 1 HP. Must play random card this turn.";
		card1.imageUrl = "inputCardImages/lagunitas.png";
		card1.count = 4;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Heineken Beer";
		card1.text = "The 'Tsingtao' of Europe? That's racist. Flammable. Eat: Remove 1 rand item from inv. Apply reverse effect to someone.";
		card1.imageUrl = "inputCardImages/heineken.png";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "One Night Werewolf";
		card1.text = "Why is the Tanner trying to kill themselves?";
		card1.imageUrl = "inputCardImages/werewolf.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Poison";
		card1.text = "Who inspected the food last time? If you take this card, you die on your next turn.";
		card1.imageUrl = "inputCardImages/werewolf.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Burn";
		card1.text = "Destroy one of your flammable items. Someone of your choice loses two health.";
		card1.imageUrl = "inputCardImages/werewolf.jpeg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Cat";
		card1.text = "It's a cat. Passive: May eat one item in inventory to gain one extra card play";
		card1.imageUrl = "inputCardImages/cat.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Centaur";
		card1.text = "Half horse, I think. Eat: Choose a card to play now. Any number is doubled. (Ordinals e.g. 1st, 2nd don't count.)";
		card1.imageUrl = "inputCardImages/centaur.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Bardic Inspiration";
		card1.text = "While you hold this card, gain a +4 to all d20 'saves'.";
		card1.imageUrl = "inputCardImages/cat.jpg";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Evil Djinn";
		card1.text = "Eat: Kill 1 plr this turn. You are cursed with the djinn, and will die on your next turn.";
		card1.imageUrl = "inputCardImages/bottle.png";
		card1.count = 3;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "State Regime";
		card1.text = "Passive: You are the Dictator. Dictator takes any 2 items once now. Only Dictator can win. Death = destroy this card.";
		card1.imageUrl = "inputCardImages/fascist.jpg";
		cards.add(card1);
		
		//People cards
		
		card1 = new Card();
		card1.cardTitle = "Andrew";
		card1.text = "Youtube Growth: Play one more card this turn and two cards next turn.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Gosu";
		card1.text = "GME Rocket: Discard and draw three cards.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Mitch";
		card1.text = "Midwestern Charm: One plr on one of their turns, must do what you say.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Christina";
		card1.text = "Defibrillator: Revive one plr to one HP. If they win, you win.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Monica";
		card1.text = "Impostor Vent: Kill one plr. Skip your next turn.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Calvin";
		card1.text = "Options Chaos: Discard all cards and redraw the same number of cards. Take another turn.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Pravan";
		card1.text = "Valorant X Ult Snipe: Remove all items from 2 players.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Scott and Rachael";
		card1.text = "Competitive Couple: Choose one person. You two are now linked. Your items are together. If they die, you die.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Will";
		card1.text = "Cake: Everyone gains one health and loses poisons. If you have food in your inventory, you die.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Hector";
		card1.text = "This Is The Way: Choose one card and add a copy of it to the hand.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Tess";
		card1.text = "Negative Points: Anyone with less than full health must skip their turn once.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Joe";
		card1.text = "Guitar Riff: Give 'Bardic Inspiration' to two other people.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Dante";
		card1.text = "Aggressive Sarcasm: Take 1 card played in last turn, apply reverse effect to someone. (Cannot win.)";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Noel";
		card1.text = "Hit the Book: Take one card you played before, play it again now.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Sophia";
		card1.text = "Poot Poot (Instant Eat): For any turn in the future, you may choose it. The turn never happened and ends.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		card1 = new Card();
		card1.cardTitle = "Georgie";
		card1.text = "Small Presence (Instant Eat): Player w/ this card may sacrifice this card to prevent dmg or death.";
		card1.imageUrl = "";
		card1.count = 1;
		cards.add(card1);
		
		PFont mono = createFont("Roboto-Bold.ttf", 32);
		textFont(mono);
		
		int numCardsCount = 0;
		int numUniqueCards = cards.size();
		for (Card card: cards) {
			background(255,255,255);
			
			fill(card.cardBackground.r, card.cardBackground.g, card.cardBackground.b);
			strokeWeight(20);
			stroke(card.cardTrim.r, card.cardTrim.g, card.cardTrim.b);
			rect(0,0,400,560,30,30,30,30);
			
			fill(0,0,0);
			textSize(30);
			textLeading(35);
			text(card.cardTitle, 30, 50);
			text(card.text, 30, 400, 340, 1000); //150 orig height
			
			try {
				PImage pImage = loadImage(card.imageUrl);
				image(pImage, 50, 75, 300, 300);
			} catch (NullPointerException e) {
				if (card.imageUrl.trim().length() > 0) 
					System.err.println("Warning, didn't find card image file: " + card.imageUrl);
			}
			
			save("./data/output/" + card.cardTitle + ";" + card.count + ".png");
			
			numCardsCount += card.count;
		}
		
		System.out.println("Processed all cards");
		System.out.println("Unique ones: " + numUniqueCards);
		System.out.println("Total card count: " + numCardsCount);
		exit();
	}

	public void draw() {
		
	}
	
}
