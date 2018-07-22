import java.util.*;

class MultiXO{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String a[] = new String[9];
		String x = "X";
		String o = "O"; 

		int chx, cho;
		int i;

		for(i=0; i<9; i++)
			a[i] = "_";

		System.out.println("Enter where you want to insert 'X': ");
		chx = sc.nextInt();
		a[chx-1] = "X";
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		System.out.println("Enter where you want to insert 'O': ");
		cho = sc.nextInt();
		if((a[cho-1])=="_")
			a[cho-1] = "O";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		System.out.println("Enter where you want to insert 'X': ");
		chx = sc.nextInt();
		if((a[chx-1])=="_")
			a[chx-1] = "X";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		System.out.println("Enter where you want to insert 'O': ");
		cho = sc.nextInt();
		if((a[cho-1])=="_")
			a[cho-1] = "O";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		System.out.println("Enter where you want to insert 'X': ");
		chx = sc.nextInt();
		if((a[chx-1])=="_")
			a[chx-1] = "X";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		if(a[0]==(a[1]) && a[1]==(a[2]) && a[2]==(x) || a[3]==(a[4]) && a[4]==(a[5]) && a[5]==(x) || a[8]==(a[5]) && a[5]==(a[2]) && a[2]==(x) || a[6]==(a[7]) && a[7]==(a[8]) && a[8]==(x) || a[0]==(a[3]) && a[3]==(a[6]) && a[6]==(x) || a[0]==(a[4]) && a[8]==(a[4]) && a[4]==(x) || a[4]==(a[1]) && a[1]==(a[7]) && a[7]==(x) || a[2]==(a[4]) && a[4]==(a[6]) && a[6]==(x)){
			System.out.println("User 'X' wins.. :)");
			System.exit(0);
		}

		System.out.println("Enter where you want to insert 'O': ");
		cho = sc.nextInt();
		if((a[cho-1])=="_")
			a[cho-1] = "O";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		if(a[0]==(a[1]) && a[1]==(a[2]) && a[2]==(o) || a[3]==(a[4]) && a[4]==(a[5]) && a[5]==(o) || a[8]==(a[5]) && a[5]==(a[2]) && a[2]==(o) || a[6]==(a[7]) && a[7]==(a[8]) && a[8]==(o) || a[0]==(a[3]) && a[3]==(a[6]) && a[6]==(o) || a[0]==(a[4]) && a[8]==(a[4]) && a[4]==(o) || a[4]==(a[1]) && a[1]==(a[7]) && a[7]==(o) || a[2]==(a[4]) && a[4]==(a[6]) && a[6]==(o)){
			System.out.println("User 'O' wins.. :)");
			System.exit(0);
		}

		System.out.println("Enter where you want to insert 'X': ");
		chx = sc.nextInt();
		if((a[chx-1])=="_")
			a[chx-1] = "X";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		if(a[0]==(a[1]) && a[1]==(a[2]) && a[2]==(x) || a[3]==(a[4]) && a[4]==(a[5]) && a[5]==(x) || a[8]==(a[5]) && a[5]==(a[2]) && a[2]==(x) || a[6]==(a[7]) && a[7]==(a[8]) && a[8]==(x) || a[0]==(a[3]) && a[3]==(a[6]) && a[6]==(x) || a[0]==(a[4]) && a[8]==(a[4]) && a[4]==(x) || a[4]==(a[1]) && a[1]==(a[7]) && a[7]==(x) || a[2]==(a[4]) && a[4]==(a[6]) && a[6]==(x)){
			System.out.println("User 'X' wins.. :)");
			System.exit(0);
		}

		System.out.println("Enter where you want to insert 'O': ");
		cho = sc.nextInt();
		if((a[cho-1])=="_")
			a[cho-1] = "O";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		if(a[0]==(a[1]) && a[1]==(a[2]) && a[2]==(o) || a[3]==(a[4]) && a[4]==(a[5]) && a[5]==(o) || a[8]==(a[5]) && a[5]==(a[2]) && a[2]==(o) || a[6]==(a[7]) && a[7]==(a[8]) && a[8]==(o) || a[0]==(a[3]) && a[3]==(a[6]) && a[6]==(o) || a[0]==(a[4]) && a[8]==(a[4]) && a[4]==(o) || a[4]==(a[1]) && a[1]==(a[7]) && a[7]==(o) || a[2]==(a[4]) && a[4]==(a[6]) && a[6]==(o)){
			System.out.println("User 'O' wins.. :)");
			System.exit(0);
		}

		System.out.println("Enter where you want to insert 'X': ");
		chx = sc.nextInt();
		if((a[chx-1])=="_")
			a[chx-1] = "X";
		else{
			System.out.println("Invalid Entry.. :(");
			System.exit(0);
		}
		System.out.println();
		for(i=0; i<9; i++){
			System.out.print(a[i]+"\t");
			if((i+1)%3==0)
				System.out.println("\n");
		}

		if(a[0]==(a[1]) && a[1]==(a[2]) && a[2]==(x) || a[3]==(a[4]) && a[4]==(a[5]) && a[5]==(x) || a[8]==(a[5]) && a[5]==(a[2]) && a[2]==(x) || a[6]==(a[7]) && a[7]==(a[8]) && a[8]==(x) || a[0]==(a[3]) && a[3]==(a[6]) && a[6]==(x) || a[0]==(a[4]) && a[8]==(a[4]) && a[4]==(x) || a[4]==(a[1]) && a[1]==(a[7]) && a[7]==(x) || a[2]==(a[4]) && a[4]==(a[6]) && a[6]==(x)){
			System.out.println("User 'X' wins.. :)");
			System.exit(0);
		}
		else{
			System.out.println("Game Tied..");
			System.exit(0);
		}

	}
}
