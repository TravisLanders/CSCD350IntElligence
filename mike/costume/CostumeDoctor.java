package costume;

import java.util.Random;

public class CostumeDoctor extends A_Costume
{
	public CostumeDoctor()
	{
		super(Specialty.HEALER, Pair.NONE);
	}

	/*
	@Override
	public void specialAttack(A_Character player, A_Character npc)
	{
		Random random = new Random(20);
		npc.setCurrentHP(npc.getCurrentHP() + random.nextInt() + 10);
	}
	*/
}
