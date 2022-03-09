import java.util.Scanner;
import java.util.ArrayList;

public class opponentDefense {

	// getInt just makes sure the person has entered an integer in range
	public static int getInt(int max, int min) {
		Scanner scan = new Scanner(System.in);

		while (!scan.hasNextInt()) {
			System.out.println("Enter an integer");
			scan.next();
		}
		// make sure it's in range
		int input = 0;

		while (true) {
			input = scan.nextInt(); // input = 10
			if (input > max || input < min) { // true
				System.out.println("Range: " + min + " - " + max);
				continue;
			} else {
				break;
			}

		}
		return input;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// So I've got a play, a play has me at a down and distance, an area of the
		// field, facing a certain type of coverage, and with a certain number of yards
		// gained.

		// I'm going to want to look at the relationship between the coverage I'm
		// playing against and the number of yards gained.
		// I'm going to want to look at the relationship between the down and what
		// coverage
		// etc

		// So the program asks me to enter in all that information. It's a loop, the
		// loop creates a Play, the Play doesn't need a name. The Play is filled with
		// all the characteristics I just entered. And then the play is added to the
		// list of plays.

		// The issue is deciding when to stop, the program needs to end eventually and
		// give me some data to work with. I need to come out of it with a dataset. Or,
		// I could just print out everything I want.
		// YPP Cover 2: print
		// YPP Cover 3: print

		// 1st step, collecting the data
		// 2nd step, printing that shit.

		ArrayList<Play> plays = new ArrayList<Play>();

		for (int i = 0; i < 4; i++) {
			Play currentPlay = new Play();

			System.out.println("1. Cover 2");
			System.out.println("2. Cover 3");
			System.out.println("3. Cover 4");
			System.out.println("4. Zone Blitz");
			System.out.println("5. Man Blitz");
			System.out.println("6. Man");
			System.out.println("7. Match");

			switch (getInt(7, 1)) {
				case 1:
					currentPlay.coverage = "Cover 2";
					break;
				case 2:
					currentPlay.coverage = "Cover 3";
					break;
				case 3:
					currentPlay.coverage = "Cover 4";
					break;
				case 4:
					currentPlay.coverage = "Zone Blitz";
					break;
				case 5:
					currentPlay.coverage = "Man Blitz";
					break;
				case 6:
					currentPlay.coverage = "Man";
					break;
				case 7:
					currentPlay.coverage = "Match";
					break;
			}

			System.out.println("Yards gained?");
			currentPlay.yardsGained = getInt(99, -30);

			System.out.println("Down?");
			currentPlay.down = getInt(4, 1);

			System.out.println("Yards to goal?");
			currentPlay.yardstoGoal = getInt(100, 0);

			plays.add(currentPlay);
		}

		// Ok now we just need to get my analysis in.
		/*
		 * What info do I want? I want to know if I get more yards on average agaainst
		 * certain types of coverage.
		 * 
		 * 
		 */

		// Print out the average yards per play against each of these coverages

		int totalYardsCover2 = 0;
		int totalYardsCover3 = 0;
		int totalYardsCover4 = 0;
		int totalYardsZoneBlitz = 0;
		int totalYardsManBlitz = 0;
		int totalYardsMan = 0;
		int totalYardsMatch = 0;

		int playsCover2 = 0;
		int playsCover3 = 0;
		int playsCover4 = 0;
		int playsZoneBlitz = 0;
		int playsManBlitz = 0;
		int playsMan = 0;
		int playsMatch = 0;

		int plays1stdownCover2 = 0;
		int plays1stdownCover3 = 0;
		int plays1stdownCover4 = 0;
		int plays1stdownZoneBlitz = 0;
		int plays1stdownManBlitz = 0;
		int plays1stdownMan = 0;
		int plays1stdownMatch = 0;

		int plays2nddownCover2 = 0;
		int plays2nddownCover3 = 0;
		int plays2nddownCover4 = 0;
		int plays2nddownZoneBlitz = 0;
		int plays2nddownManBlitz = 0;
		int plays2nddownMan = 0;
		int plays2nddownMatch = 0;

		int plays3rddownCover2 = 0;
		int plays3rddownCover3 = 0;
		int plays3rddownCover4 = 0;
		int plays3rddownZoneBlitz = 0;
		int plays3rddownManBlitz = 0;
		int plays3rddownMan = 0;
		int plays3rddownMatch = 0;

		int plays1stdown = 0;
		int plays2nddown = 0;
		int plays3rddown = 0;
		int plays1stdownRedzone = 0;
		int plays2nddownRedzone = 0;
		int plays3rddownRedzone = 0;

		int totalYards1stdownCover2 = 0;
		int totalYards1stdownCover3 = 0;
		int totalYards1stdownCover4 = 0;
		int totalYards1stdownZoneBlitz = 0;
		int totalYards1stdownManBlitz = 0;
		int totalYards1stdownMan = 0;
		int totalYards1stdownMatch = 0;

		int totalYards2nddownCover2 = 0;
		int totalYards2nddownCover3 = 0;
		int totalYards2nddownCover4 = 0;
		int totalYards2nddownZoneBlitz = 0;
		int totalYards2nddownManBlitz = 0;
		int totalYards2nddownMan = 0;
		int totalYards2nddownMatch = 0;

		int totalYards3rddownCover2 = 0;
		int totalYards3rddownCover3 = 0;
		int totalYards3rddownCover4 = 0;
		int totalYards3rddownZoneBlitz = 0;
		int totalYards3rddownManBlitz = 0;
		int totalYards3rddownMan = 0;
		int totalYards3rddownMatch = 0;

		int plays1stdownCover2Redzone = 0;
		int plays1stdownCover3Redzone = 0;
		int plays1stdownCover4Redzone = 0;
		int plays1stdownZoneBlitzRedzone = 0;
		int plays1stdownManBlitzRedzone = 0;
		int plays1stdownManRedzone = 0;
		int plays1stdownMatchRedzone = 0;

		int plays2nddownCover2Redzone = 0;
		int plays2nddownCover3Redzone = 0;
		int plays2nddownCover4Redzone = 0;
		int plays2nddownZoneBlitzRedzone = 0;
		int plays2nddownManBlitzRedzone = 0;
		int plays2nddownManRedzone = 0;
		int plays2nddownMatchRedzone = 0;

		int plays3rddownCover2Redzone = 0;
		int plays3rddownCover3Redzone = 0;
		int plays3rddownCover4Redzone = 0;
		int plays3rddownZoneBlitzRedzone = 0;
		int plays3rddownManBlitzRedzone = 0;
		int plays3rddownManRedzone = 0;
		int plays3rddownMatchRedzone = 0;

		int totalYards1stdownCover2Redzone = 0;
		int totalYards1stdownCover3Redzone = 0;
		int totalYards1stdownCover4Redzone = 0;
		int totalYards1stdownZoneBlitzRedzone = 0;
		int totalYards1stdownManBlitzRedzone = 0;
		int totalYards1stdownManRedzone = 0;
		int totalYards1stdownMatchRedzone = 0;

		int totalYards2nddownCover2Redzone = 0;
		int totalYards2nddownCover3Redzone = 0;
		int totalYards2nddownCover4Redzone = 0;
		int totalYards2nddownZoneBlitzRedzone = 0;
		int totalYards2nddownManBlitzRedzone = 0;
		int totalYards2nddownManRedzone = 0;
		int totalYards2nddownMatchRedzone = 0;

		int totalYards3rddownCover2Redzone = 0;
		int totalYards3rddownCover3Redzone = 0;
		int totalYards3rddownCover4Redzone = 0;
		int totalYards3rddownZoneBlitzRedzone = 0;
		int totalYards3rddownManBlitzRedzone = 0;
		int totalYards3rddownManRedzone = 0;
		int totalYards3rddownMatchRedzone = 0;

		for (Play play : plays) {

			// Descriptive statistics
			if (play.down == 1) {
				plays1stdown++;
				if (play.yardstoGoal < 30) {
					plays1stdownRedzone++;
				}
				switch (play.coverage) {
					case "Cover 2":
						totalYards1stdownCover2 += play.yardsGained;
						plays1stdownCover2++;
						totalYardsCover2 += play.yardsGained;
						playsCover2++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownCover2Redzone += play.yardsGained;
							plays1stdownCover2Redzone++;
						}
						break;
					case "Cover 3":
						totalYards1stdownCover3 += play.yardsGained;
						plays1stdownCover3++;
						totalYardsCover3 += play.yardsGained;
						playsCover3++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownCover3Redzone += play.yardsGained;
							plays1stdownCover3Redzone++;
						}
						break;
					case "Cover 4":
						totalYards1stdownCover4 += play.yardsGained;
						plays1stdownCover4++;
						totalYardsCover4 += play.yardsGained;
						playsCover4++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownCover4Redzone += play.yardsGained;
							plays1stdownCover4Redzone++;
						}
						break;
					case "Zone Blitz":
						totalYards1stdownZoneBlitz += play.yardsGained;
						totalYardsZoneBlitz += play.yardsGained;
						playsZoneBlitz++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownZoneBlitzRedzone += play.yardsGained;
							plays1stdownZoneBlitzRedzone++;
						}
						break;
					case "Man Blitz":
						totalYards1stdownManBlitz += play.yardsGained;
						plays1stdownManBlitz++;
						totalYardsManBlitz += play.yardsGained;
						playsManBlitz++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownManBlitzRedzone += play.yardsGained;
							plays1stdownManBlitzRedzone++;
						}
						break;
					case "Man":
						totalYards1stdownMan += play.yardsGained;
						plays1stdownMan++;
						totalYardsMan += play.yardsGained;
						playsMan++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownManRedzone += play.yardsGained;
							plays1stdownManRedzone++;
						}
						break;
					case "Match":
						totalYards1stdownMatch += play.yardsGained;
						plays1stdownMatch++;
						totalYardsMatch += play.yardsGained;
						playsMatch++;
						if (play.yardstoGoal < 30) {
							totalYards1stdownMatchRedzone += play.yardsGained;
							plays1stdownMatchRedzone++;
						}
						break;
				}
			}

			else if (play.down == 2) {
				plays2nddown++;
				if (play.yardstoGoal < 30) {
					plays2nddownRedzone++;
				}
				switch (play.coverage) {
					case "Cover 2":
						totalYards2nddownCover2 += play.yardsGained;
						plays2nddownCover2++;
						totalYardsCover2 += play.yardsGained;
						playsCover2++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownCover2Redzone += play.yardsGained;
							plays2nddownCover2Redzone++;
						}
						break;
					case "Cover 3":
						totalYards2nddownCover3 += play.yardsGained;
						plays2nddownCover3++;
						totalYardsCover3 += play.yardsGained;
						playsCover3++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownCover3Redzone += play.yardsGained;
							plays2nddownCover3Redzone++;
						}
						break;
					case "Cover 4":
						totalYards2nddownCover4 += play.yardsGained;
						plays2nddownCover4++;
						totalYardsCover4 += play.yardsGained;
						playsCover4++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownCover4Redzone += play.yardsGained;
							plays2nddownCover4Redzone++;
						}
						break;
					case "Zone Blitz":
						totalYards2nddownZoneBlitz += play.yardsGained;
						plays2nddownZoneBlitz++;
						totalYardsZoneBlitz += play.yardsGained;
						playsZoneBlitz++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownZoneBlitzRedzone += play.yardsGained;
							plays2nddownZoneBlitzRedzone++;
						}
						break;
					case "Man Blitz":
						totalYards2nddownManBlitz += play.yardsGained;
						plays2nddownManBlitz++;
						totalYardsManBlitz += play.yardsGained;
						playsManBlitz++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownManBlitzRedzone += play.yardsGained;
							plays2nddownManBlitzRedzone++;
						}
						break;
					case "Man":
						totalYards2nddownMan += play.yardsGained;
						plays2nddownMan++;
						totalYardsMan += play.yardsGained;
						playsMan++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownManRedzone += play.yardsGained;
							plays2nddownManRedzone++;
						}
						break;
					case "Match":
						totalYards2nddownMatch += play.yardsGained;
						plays2nddownMatch++;
						totalYardsMatch += play.yardsGained;
						playsMatch++;
						if (play.yardstoGoal < 30) {
							totalYards2nddownMatchRedzone += play.yardsGained;
							plays2nddownMatchRedzone++;
						}
						break;
				}
			}

			else if (play.down == 3) {
				plays3rddown++;
				if (play.yardstoGoal < 30) {
					plays3rddownRedzone++;
				}
				switch (play.coverage) {
					case "Cover 2":
						totalYards3rddownCover2 += play.yardsGained;
						plays3rddownCover2++;
						totalYardsCover2 += play.yardsGained;
						playsCover2++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownCover2Redzone += play.yardsGained;
							plays3rddownCover2Redzone++;
						}
						break;
					case "Cover 3":
						totalYards3rddownCover3 += play.yardsGained;
						plays3rddownCover3++;
						totalYardsCover3 += play.yardsGained;
						playsCover3++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownCover3Redzone += play.yardsGained;
							plays3rddownCover3Redzone++;
						}
						break;
					case "Cover 4":
						totalYards3rddownCover4 += play.yardsGained;
						plays3rddownCover4++;
						totalYardsCover4 += play.yardsGained;
						playsCover4++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownCover4Redzone += play.yardsGained;
							plays3rddownCover4Redzone++;
						}
						break;
					case "Zone Blitz":
						totalYards3rddownZoneBlitz += play.yardsGained;
						plays3rddownZoneBlitz++;
						totalYardsZoneBlitz += play.yardsGained;
						playsZoneBlitz++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownZoneBlitzRedzone += play.yardsGained;
							plays3rddownZoneBlitzRedzone++;
						}
						break;
					case "Man Blitz":
						totalYards3rddownManBlitz += play.yardsGained;
						plays3rddownManBlitz++;
						totalYardsManBlitz += play.yardsGained;
						playsManBlitz++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownManBlitzRedzone += play.yardsGained;
							plays3rddownManBlitzRedzone++;
						}
						break;
					case "Man":
						totalYards3rddownMan += play.yardsGained;
						plays3rddownMan++;
						totalYardsMan += play.yardsGained;
						playsMan++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownManRedzone += play.yardsGained;
							plays3rddownManRedzone++;
						}
						break;
					case "Match":
						totalYards3rddownMatch += play.yardsGained;
						plays3rddownMatch++;
						totalYardsMatch += play.yardsGained;
						playsMatch++;
						if (play.yardstoGoal < 30) {
							totalYards3rddownMatchRedzone += play.yardsGained;
							plays3rddownMatchRedzone++;
						}
						break;
				}
			}
		}

		double YPPCover2 = getYPP(totalYardsCover2, playsCover2);
		double YPPCover3 = getYPP(totalYardsCover3, playsCover3);
		double YPPCover4 = getYPP(totalYardsCover4, playsCover4);
		double YPPZoneBlitz = getYPP(totalYardsZoneBlitz, playsZoneBlitz);
		double YPPManBlitz = getYPP(totalYardsManBlitz, playsManBlitz);
		double YPPMan = getYPP(totalYardsMan, playsMan);
		double YPPMatch = getYPP(totalYardsMatch, playsMatch);

		double YPP1stdownCover2 = getYPP(totalYards1stdownCover2, plays1stdownCover2);
		double YPP1stdownCover3 = getYPP(totalYards1stdownCover3, plays1stdownCover3);
		double YPP1stdownCover4 = getYPP(totalYards1stdownCover4, plays1stdownCover4);
		double YPP1stdownZoneBlitz = getYPP(totalYards1stdownZoneBlitz, plays1stdownZoneBlitz);
		double YPP1stdownManBlitz = getYPP(totalYards1stdownManBlitz, plays1stdownManBlitz);
		double YPP1stdownMan = getYPP(totalYards1stdownMan, plays1stdownMan);
		double YPP1stdownMatch = getYPP(totalYards1stdownMatch, plays1stdownMatch);

		double YPP2nddownCover2 = getYPP(totalYards2nddownCover2, plays2nddownCover2);
		double YPP2nddownCover3 = getYPP(totalYards2nddownCover3, plays2nddownCover3);
		double YPP2nddownCover4 = getYPP(totalYards2nddownCover4, plays2nddownCover4);
		double YPP2nddownZoneBlitz = getYPP(totalYards2nddownZoneBlitz, plays2nddownZoneBlitz);
		double YPP2nddownManBlitz = getYPP(totalYards2nddownManBlitz, plays2nddownManBlitz);
		double YPP2nddownMan = getYPP(totalYards2nddownMan, plays2nddownMan);
		double YPP2nddownMatch = getYPP(totalYards2nddownMatch, plays2nddownMatch);

		double YPP3rddownCover2 = getYPP(totalYards3rddownCover2, plays3rddownCover2);
		double YPP3rddownCover3 = getYPP(totalYards3rddownCover3, plays3rddownCover3);
		double YPP3rddownCover4 = getYPP(totalYards3rddownCover4, plays3rddownCover4);
		double YPP3rddownZoneBlitz = getYPP(totalYards3rddownZoneBlitz, plays3rddownZoneBlitz);
		double YPP3rddownManBlitz = getYPP(totalYards3rddownManBlitz, plays3rddownManBlitz);
		double YPP3rddownMan = getYPP(totalYards3rddownMan, plays3rddownMan);
		double YPP3rddownMatch = getYPP(totalYards3rddownMatch, plays3rddownMatch);

		// Redzone
		double YPP1stdownCover2Redzone = getYPP(totalYards1stdownCover2Redzone, plays1stdownCover2Redzone);
		double YPP1stdownCover3Redzone = getYPP(totalYards1stdownCover3Redzone, plays1stdownCover3Redzone);
		double YPP1stdownCover4Redzone = getYPP(totalYards1stdownCover4Redzone, plays1stdownCover4Redzone);
		double YPP1stdownZoneBlitzRedzone = getYPP(totalYards1stdownZoneBlitzRedzone, plays1stdownZoneBlitzRedzone);
		double YPP1stdownManBlitzRedzone = getYPP(totalYards1stdownManBlitzRedzone, plays1stdownManBlitzRedzone);
		double YPP1stdownManRedzone = getYPP(totalYards1stdownManRedzone, plays1stdownManRedzone);
		double YPP1stdownMatchRedzone = getYPP(totalYards1stdownMatchRedzone, plays1stdownMatchRedzone);

		double YPP2nddownCover2Redzone = getYPP(totalYards2nddownCover2Redzone, plays2nddownCover2Redzone);
		double YPP2nddownCover3Redzone = getYPP(totalYards2nddownCover3Redzone, plays2nddownCover3Redzone);
		double YPP2nddownCover4Redzone = getYPP(totalYards2nddownCover4Redzone, plays2nddownCover4Redzone);
		double YPP2nddownZoneBlitzRedzone = getYPP(totalYards2nddownZoneBlitzRedzone, plays2nddownZoneBlitzRedzone);
		double YPP2nddownManBlitzRedzone = getYPP(totalYards2nddownManBlitzRedzone, plays2nddownManBlitzRedzone);
		double YPP2nddownManRedzone = getYPP(totalYards2nddownManRedzone, plays2nddownManRedzone);
		double YPP2nddownMatchRedzone = getYPP(totalYards2nddownMatchRedzone, plays2nddownMatchRedzone);

		double YPP3rddownCover2Redzone = getYPP(totalYards3rddownCover2Redzone, plays3rddownCover2Redzone);
		double YPP3rddownCover3Redzone = getYPP(totalYards3rddownCover3Redzone, plays3rddownCover3Redzone);
		double YPP3rddownCover4Redzone = getYPP(totalYards3rddownCover4Redzone, plays3rddownCover4Redzone);
		double YPP3rddownZoneBlitzRedzone = getYPP(totalYards3rddownZoneBlitzRedzone, plays3rddownZoneBlitzRedzone);
		double YPP3rddownManBlitzRedzone = getYPP(totalYards3rddownManBlitzRedzone, plays3rddownManBlitzRedzone);
		double YPP3rddownManRedzone = getYPP(totalYards3rddownManRedzone, plays3rddownManRedzone);
		double YPP3rddownMatchRedzone = getYPP(totalYards3rddownMatchRedzone, plays3rddownMatchRedzone);

		System.out.println("Cover 2: You averaged " + YPPCover2 + " yards per play on " + playsCover2 + " plays");
		System.out.println("Cover 3: You averaged " + YPPCover3 + " yards per play on " + playsCover3 + " plays");
		System.out.println("Cover 4: You averaged " + YPPCover4 + " yards per play on " + playsCover4 + " plays");
		System.out.println(
				"Zone Blitz: You averaged " + YPPZoneBlitz + " yards per play on " + playsZoneBlitz + " plays");
		System.out.println("Man Blitz: You averaged " + YPPManBlitz + " yards per play on " + playsManBlitz + " plays");
		System.out.println("Man: You averaged " + YPPMan + " yards per play on " + playsMan + " plays");
		System.out.println("Match: You averaged " + YPPMatch + " yards per play on " + playsMatch + " plays");

		// (cover2 && 1st down / 1st down) / 1st down, (total yards gained on cover 2 on
		// 1st down/ total number of 1st down plays with cover 2)

		System.out.println();
		System.out.println();

		System.out.println("1st down:");
		System.out.println(
				"   Cover 2: " + ((double) plays1stdownCover2 / plays1stdown) * 100 + "%, YPP = " + YPP1stdownCover2);
		System.out.println(
				"   Cover 3: " + ((double) plays1stdownCover3 / plays1stdown) * 100 + "%, YPP = " + YPP1stdownCover3);
		System.out.println(
				"   Cover 4: " + ((double) plays1stdownCover4 / plays1stdown) * 100 + "%, YPP = " + YPP1stdownCover4);
		System.out.println("   Zone Blitz: " + ((double) plays1stdownZoneBlitz / plays1stdown) * 100 + "%, YPP = "
				+ YPP1stdownZoneBlitz);
		System.out.println("   Man Blitz: " + ((double) plays1stdownManBlitz / plays1stdown) * 100 + "%, YPP = "
				+ YPP1stdownManBlitz);
		System.out.println("   Man: " + ((double) plays1stdownMan / plays1stdown) * 100 + "%, YPP = " + YPP1stdownMan);
		System.out.println(
				"   Match: " + ((double) plays1stdownMatch / plays1stdown) * 100 + "%, YPP = " + YPP1stdownMatch);

		System.out.println("2nd down:");
		System.out.println(
				"   Cover 2: " + ((double) plays2nddownCover2 / plays2nddown) * 100 + "%, YPP = " + YPP2nddownCover2);
		System.out.println(
				"   Cover 3: " + ((double) plays2nddownCover3 / plays2nddown) * 100 + "%, YPP = " + YPP2nddownCover3);
		System.out.println(
				"   Cover 4: " + ((double) plays2nddownCover4 / plays2nddown) * 100 + "%, YPP = " + YPP2nddownCover4);
		System.out.println("   Zone Blitz: " + ((double) plays2nddownZoneBlitz / plays2nddown) * 100 + "%, YPP = "
				+ YPP2nddownZoneBlitz);
		System.out.println("   Man Blitz: " + ((double) plays2nddownManBlitz / plays2nddown) * 100 + "%, YPP = "
				+ YPP2nddownManBlitz);
		System.out.println("   Man: " + ((double) plays2nddownMan / plays2nddown) * 100 + "%, YPP = " + YPP2nddownMan);
		System.out.println(
				"   Match: " + ((double) plays2nddownMatch / plays2nddown) * 100 + "%, YPP = " + YPP2nddownMatch);

		System.out.println("3rd down:");
		System.out.println(
				"   Cover 2: " + ((double) plays3rddownCover2 / plays3rddown) * 100 + "%, YPP = " + YPP3rddownCover2);
		System.out.println(
				"   Cover 3: " + ((double) plays3rddownCover3 / plays3rddown) * 100 + "%, YPP = " + YPP3rddownCover3);
		System.out.println(
				"   Cover 4: " + ((double) plays3rddownCover4 / plays3rddown) * 100 + "%, YPP = " + YPP3rddownCover4);
		System.out.println("   Zone Blitz: " + ((double) plays3rddownZoneBlitz / plays3rddown) * 100 + "%, YPP = "
				+ YPP3rddownZoneBlitz);
		System.out.println("   Man Blitz: " + ((double) plays3rddownManBlitz / plays3rddown) * 100 + "%, YPP = "
				+ YPP3rddownManBlitz);
		System.out.println("   Man: " + ((double) plays3rddownMan / plays3rddown) * 100 + "%, YPP = " + YPP3rddownMan);
		System.out.println(
				"   Match: " + ((double) plays3rddownMatch / plays3rddown) * 100 + "%, YPP = " + YPP3rddownMatch);

		System.out.println();
		System.out.println();

		System.out.println("Redzone 1st down:");
		System.out.println("   Cover 2: " + ((double) plays1stdownCover2Redzone / plays1stdownRedzone) * 100
				+ "%, YPP = " + YPP1stdownCover2Redzone);
		System.out.println("   Cover 3: " + ((double) plays1stdownCover3Redzone / plays1stdownRedzone) * 100
				+ "%, YPP = " + YPP1stdownCover3Redzone);
		System.out.println("   Cover 4: " + ((double) plays1stdownCover4Redzone / plays1stdownRedzone) * 100
				+ "%, YPP = " + YPP1stdownCover4Redzone);
		System.out.println("   Zone Blitz: " + ((double) plays1stdownZoneBlitzRedzone / plays1stdownRedzone) * 100
				+ "%, YPP = " + YPP1stdownZoneBlitzRedzone);
		System.out.println("   Man Blitz: " + ((double) plays1stdownManBlitzRedzone / plays1stdownRedzone) * 100
				+ "%, YPP = " + YPP1stdownManBlitzRedzone);
		System.out.println("   Man: " + ((double) plays1stdownManRedzone / plays1stdownRedzone) * 100 + "%, YPP = "
				+ YPP1stdownManRedzone);
		System.out.println("   Match: " + ((double) plays1stdownMatchRedzone / plays1stdownRedzone) * 100 + "%, YPP = "
				+ YPP1stdownMatchRedzone);

		System.out.println("Redzone 2nd down:");
		System.out.println("   Cover 2: " + ((double) plays2nddownCover2Redzone / plays2nddownRedzone) * 100
				+ "%, YPP = " + YPP2nddownCover2Redzone);
		System.out.println("   Cover 3: " + ((double) plays2nddownCover3Redzone / plays2nddownRedzone) * 100
				+ "%, YPP = " + YPP2nddownCover3Redzone);
		System.out.println("   Cover 4: " + ((double) plays2nddownCover4Redzone / plays2nddownRedzone) * 100
				+ "%, YPP = " + YPP2nddownCover4Redzone);
		System.out.println("   Zone Blitz: " + ((double) plays2nddownZoneBlitzRedzone / plays2nddownRedzone) * 100
				+ "%, YPP = " + YPP2nddownZoneBlitzRedzone);
		System.out.println("   Man Blitz: " + ((double) plays2nddownManBlitzRedzone / plays2nddownRedzone) * 100
				+ "%, YPP = " + YPP2nddownManBlitzRedzone);
		System.out.println("   Man: " + ((double) plays2nddownManRedzone / plays2nddownRedzone) * 100 + "%, YPP = "
				+ YPP2nddownManRedzone);
		System.out.println("   Match: " + ((double) plays2nddownMatchRedzone / plays2nddownRedzone) * 100 + "%, YPP = "
				+ YPP2nddownMatchRedzone);

		System.out.println("Redzone 3rd down:");
		System.out.println("   Cover 2: " + ((double) plays3rddownCover2Redzone / plays3rddownRedzone) * 100
				+ "%, YPP = " + YPP3rddownCover2Redzone);
		System.out.println("   Cover 3: " + ((double) plays3rddownCover3Redzone / plays3rddownRedzone) * 100
				+ "%, YPP = " + YPP3rddownCover3Redzone);
		System.out.println("   Cover 4: " + ((double) plays3rddownCover4Redzone / plays3rddownRedzone) * 100
				+ "%, YPP = " + YPP3rddownCover4Redzone);
		System.out.println("   Zone Blitz: " + ((double) plays3rddownZoneBlitzRedzone / plays3rddownRedzone) * 100
				+ "%, YPP = " + YPP3rddownZoneBlitzRedzone);
		System.out.println("   Man Blitz: " + ((double) plays3rddownManBlitzRedzone / plays3rddownRedzone) * 100
				+ "%, YPP = " + YPP3rddownManBlitzRedzone);
		System.out.println("   Man: " + ((double) plays3rddownManRedzone / plays3rddownRedzone) * 100 + "%, YPP = "
				+ YPP3rddownManRedzone);
		System.out.println("   Match: " + ((double) plays3rddownMatchRedzone / plays3rddownRedzone) * 100 + "%, YPP = "
				+ YPP3rddownMatchRedzone);
	}

	public static double getYPP(int totalYards, int plays) {
		if (plays == 0) {
			return 0;
		} else {
			return (double) totalYards / (double) plays;
		}
	}

}
