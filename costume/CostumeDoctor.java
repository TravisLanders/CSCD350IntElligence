package costume;

import java.util.Random;

public class CostumeDoctor extends A_Costume
{
	public CostumeDoctor(Specialty specialtyIn, Pair pairIn)
	{
		super(Specialty.HEALER, Pair.NONE);
	}

	/*
	@Override
	public void specialAttack(A_Character player, A_Character NPC)
	{
		Random random = new Random(20);
		NPC.setCurrentHP(NPC.getCurrentHP() + random.nextInt() + 10);
	}
	*/
}
