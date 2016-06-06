import costume.*;
import character.*;
import battle.*;
import DataBaseFiles.*;

import java.io.FileNotFoundException;
import java.util.*;

public class BattleTest
{
	protected static ArrayList<String> namesList = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException
	{
		CostumeCop cop = new CostumeCop();
		CostumeMiner miner = new CostumeMiner();
		DataBaseManager dbm = new DataBaseManager();
		//ArrayList<String> namesList = new ArrayList<String>();
		System.out.println("What is your name?");
		Scanner kin = new Scanner(System.in);
		String name = kin.nextLine();		
		namesList.add(name);
		Student player = new Student(namesList.get(namesList.size() - 1), cop, true);
		player.setLeader();
		Party party = new Party(player);
		
		boolean playing = true;
		
		while(playing)
		{
			System.out.println("Would you like to battle? Y/N");
			String input = kin.next();
			input = input.toLowerCase();
			if(input.equals("n"))
			{
				playing = false;
			}
			
			else
			{
				Student opponent = createStudent(dbm);
				BattleStudent battle = new BattleStudent(player, opponent, party);
				battle.beginBattle();
			}
		}
		
		/*
		namesList = dbm.addStudent(namesList);
		Student opponent = new Student(namesList.get(namesList.size() - 1), miner, false);
		Party party = new Party(player);
		Battle battle = new Battle(player, opponent, party);
		battle.beginBattle();
		namesList = dbm.addStudent(namesList);
		Student opponent2 = new Student(namesList.get(namesList.size() - 1), miner, false);
		battle = new Battle(player, opponent2, party);
		battle.beginBattle();
		*/
	}
	
	public static Student createStudent(DataBaseManager dbm) throws FileNotFoundException
	{
		Random random = new Random();
		//random.setSeed(4);
		int seed = random.nextInt(10);
		namesList = dbm.addStudent(namesList);

		String name = namesList.get(namesList.size() - 1);
		A_Costume costume;
		switch(seed)
		{
			case(0):
				costume = new CostumeCoffeeCup();
				break;
			case(1):
				costume = new CostumeConstructionWorker();
				break;
			case(2):
				costume = new CostumeCop();
				break;
			case(3):
				costume = new CostumeFreshman();
				break;
			case(4):
				costume = new CostumeMiner();
				break;
			case(5):
				costume = new CostumeOptometrist();
				break;
			case(6):
				costume = new CostumePenguin();
				break;
			case(7):
				costume = new CostumePie();
				break;
			case(8):
				costume = new CostumeRobot();
				break;
			case(9):
				costume = new CostumeSnake();
				break;
			case(10):
				costume = new CostumeWizard();
				break;
			default:
				costume = new CostumeFreshman();
				break;
		
		}
		return new Student(name, costume, false);
	}

}
