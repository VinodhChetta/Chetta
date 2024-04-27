package Hotelname;

public class Condition {
	
		public void VoterID(int age)
		{
		
		if(age>=18) {
			System.out.println("you are eligible to vote");
			
		}
		else if (age<18)
			System.out.println("you are not eligible to vote yet");
		}

		public void Alphabet(String Alpha)
		{
			switch(Alpha.toUpperCase())
			{
			case "A":
			System.out.println("1");
			break;
			
			case "B":
			System.out.println("2");
			break;
			case "C":
			System.out.println("3");
			break;
			case "D":
			System.out.println("4");
			break;
			case "E":
			System.out.println("5");
			break;
			case "F":
			System.out.println("6");
			break;
			case "G":
			System.out.println("7");
			break;
			case "H":
			System.out.println("8");
			break;
						
			}
			
			public void Alphabet(int Alpa)
			{
				switch(Alpha.toLowerCase())
				{
				case "a":
				System.out.println("9");
				break;
				}
			}
		}
		

	public static void main(String[] args) 
	{
		Condition C=new Condition();
		C.VoterID(17);
		C.Alphabet("a");
		

	}

}
