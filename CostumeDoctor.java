package Final;

public class CostumeDoctor extends A_Costume
{
	public CostumeDoctor()
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
