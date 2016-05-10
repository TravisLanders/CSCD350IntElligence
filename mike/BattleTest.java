import costume.*;
import character.*;
import battle.*;

public class BattleTest
{

	public static void main(String[] args)
	{
		CostumeCop cop = new CostumeCop();
		CostumeMiner miner = new CostumeMiner();
		Student player = new Student("Mike", cop, true);
		Student opponent = new Student("Jerry", miner, false);
		Party party = new Party(player);
		Battle battle = new Battle(player, opponent, party);
		battle.beginBattle();
	}

}