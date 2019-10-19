import java.util.*;

	class Player {
		private String name;
		private int goals;
		private String team;

		Player() {
		name = team = "";
			goals = 0;

		}

		Player(String name, int goal, String team){
		this.name = name;
		this.goals = goal;
		this.team = team;
		
		}

		void setName(String name) {
		this.name = name;

		}

		void setTeam(String team) {
		this.team = team;

		}

		void setGoals(int goals) {
		this.goals = goals;

		}

		String getName(){
			return name;

		}

		String getTeam() {
			return team;

		}

		int getGoals() {
			return goals;

		}
			
		public String toString() {
			return "Player Name: " + name + ", " + team + " team goals:  " + goals;

		}
		}
			
		class Goal {
		private int minute;
		private Player player;
		
		Goal(){	
		minute = 0;
		player = null;

		}
			
		Goal(int min, Player p){	
		minute = min;
		player = p;

		}
			
		void setMinute(int minute) {
		this.minute = minute;

		}
		
		void setPlayer(Player player) {
		this.player = player;

		}
			
		int getMinute() {
			return minute;

		}

		Player getPlayer() {
			return player;

		}

		public String toString(){

		return "Minute goal is scored: " + minute + ", " + "Player who scored the goal: " + player.getName();

		}
		}

		public class SoccerMatch {
		Date startTime;
		Date endTime;	
		String location;
		String home;
		String visitor;	
		Player homePlayers[];
		Player visitorPlayers[];
		Goal homeGoals[];
		Goal visitorGoals[];
		int homePlayerCounter, visitPlayerCounter;
		int homeGoalCounter, visitGoalCounter;

		SoccerMatch(){
		startTime = endTime = null;
		location = home = visitor = null;
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;

		for(int i = 0; i < 11; i++) {
			homePlayers[i] = new Player();
			visitorPlayers[i] = new Player();

		}

		for(int i = 0; i < 10; i++) {
			homeGoals[i] = new Goal();
			visitorGoals[i] = new Goal();

		}
		}
			
		SoccerMatch(Date st, Date et, String loc, String ho, String vi){ 
		this();
		startTime = st;
		endTime = et;
		location = loc;
		home = ho;
		visitor = vi;

		}
			
		void addHomePlayer(Player p) {
			homePlayers[homePlayerCounter++] = p;

		}
			
		
		void addVisitorPlayer(Player p) {
			visitorPlayers[visitPlayerCounter++] = p;

		}

		
		void addHomeGoal(Goal g) {
			homeGoals[homeGoalCounter++] = g;

		}

		void addVisitorGoal(Goal g) {
			visitorGoals[visitGoalCounter++] = g;

		}

		int [] getHomeGoals() {
			int goals[] = new int[10];
			
		for(int i = 0; i < 10; i++)
			goals[i] = homeGoals[i].getPlayer().getGoals();
			return goals;

		}
			
		int [] getVisitorGoals() {
			int goals[] = new int[10];

		for(int i = 0; i < 10; i++)
			goals[i] = visitorGoals[i].getPlayer().getGoals();
			return goals;

		}
		
		String getWinner() {
		String winStatus = " ";
		int homeGoals[] = getHomeGoals();
		int visitGoals[] = getVisitorGoals();
		int homeScore = 0, visitorScore = 0;

		for(int i = 0; i < 10; i++) {
			homeScore += homeGoals[i];
			visitorScore += visitGoals[i];

		}

		winStatus = "Home Team Total Goals: " + homeScore + ", " + "Visitor Team Total Goals: " + visitorScore;


		if(homeScore > visitorScore)
			winStatus += " The home team wins";

		else if(visitorScore > homeScore)
			winStatus += " The visitor team wins";

		else
			winStatus += " The game is a tie";

		return 
			winStatus;

		}
			
		public static void main(String[] args) {
			Random rand = new Random();
			@SuppressWarnings("deprecation")
			Date firstDate = new Date(2019, 10, 18);
			@SuppressWarnings("deprecation")
			Date secondDate = new Date(2019, 10, 18);

			

		SoccerMatch sm = new SoccerMatch(firstDate, secondDate, "Red", "Blue", "Green");
		String homePlayerName [] = {"John", "Jack", "Chris", "Matt", "Justin", "Tim", "Tom", "Mike", "Rick", "David", "Bob"};
		String visitPlayerName [] = {"Jill", "Jackie", "Jaclyn", "Nicole", "Jess", "Mary", "Lilly", "Lauren", "Amanda", "Katie", "Karen"};

		for(int x = 0; x < 11; x++) {
		sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Blue"));
		sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Red"));

		}

		for(int x = 0; x < 10; x++) {

		sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[x]));
		sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[x]));

		}
			
		System.out.print("Home Team Players: ");
			for(int i = 0; i < 11; i++)
				System.out.println(sm.homePlayers[i]);

		System.out.print("Visiting Team Players: ");
			for(int i = 0; i < 11; i++)
				System.out.println(sm.visitorPlayers[i]);
			
		System.out.print("Home Team Goals: ");
			for(int i = 0; i < 10; i++)
				System.out.println(sm.homeGoals[i]);

		System.out.print("Visiting Team Goals: ");
			for(int i = 0; i < 10; i++)
				System.out.println(sm.visitorGoals[i]);

		System.out.print("Winner: ");
		System.out.println(sm.getWinner());

		}
		}

