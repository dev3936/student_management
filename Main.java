import java.util.Scanner;
class Add_student
{
int roll;
int marks;
String name;

Add_student(int x,int y,String z)
{
roll = x;
marks = y;
name = z;
}

}


public class Main{
    public static void main(String args[])
    {
    System.out.println("Enter the value of student");
    Scanner S = new Scanner(System.in);

    Add_student[] A = new Add_student[201];  
    int t;
    int x = 0;
    int count = 0;

    while(true)
    {
        System.out.println("Enter 1 for insert student data");
        System.out.println("Enter 2 for display");
        System.out.println("Enter 3 for delete");
        System.out.println("Enter 4 for update");
        System.out.println("Enter 5 for exit");

        x = S.nextInt();

        switch (x)
        {
            case 1 : {
                for (int i = count; i <= 200; i++)
                {
                    System.out.println("Enter roll number");
                    int n = S.nextInt();

                    System.out.println("Enter marks");
                    int y = S.nextInt();

                    S.nextLine(); // consume newline
                    System.out.println("Enter name ");
                    String z = S.nextLine();

                    A[i] = new Add_student(n,y,z);
                    count++;

                    System.out.println("Do you want to add more? (yes/no)");
                    String choice = S.nextLine();
                    if (!choice.equalsIgnoreCase("yes")) {
                        break;
                    }
                }
                break;
            }

            case 2: 
            {
                System.out.println("Enter the roll number");
                t = S.nextInt();

                boolean found = false;
                for (int i = 0; i < count; i++)
                {
                    if(A[i] != null && A[i].roll == t){
                        System.out.println("roll number is "+ A[i].roll);
                        System.out.println("marks is "+ A[i].marks);
                        System.out.println("Name = "+ A[i].name);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found");
                }
                break;
            }

            case 3: 
            {
                System.out.println("Enter the roll number");  
                t = S.nextInt();

                boolean deleted = false;
                for (int i = 0; i < count; i++)
                {
                    if(A[i] != null && A[i].roll == t){
                        for (int j = i; j < count - 1; j++) {
                            A[j] = A[j + 1];
                        }
                        A[count - 1] = null;
                        count--;
                        System.out.println("Student deleted");
                        deleted = true;
                        break;
                    }
                }
                if (!deleted) {
                    System.out.println("Student not found");
                }
                break;
            }

            case 4: 
            {
                System.out.println("Enter the roll number");
                t = S.nextInt();

                boolean updated = false;
                for (int i = 0; i < count; i++)
                {
                    if(A[i] != null && A[i].roll == t){
                        int r,g,l;
                        String q;

                        System.out.println("Enter 1 for update roll");
                        System.out.println("Enter 2 for update marks");
                        System.out.println("Enter 3 for update name");     

                        l = S.nextInt();

                        switch (l) {
                            case 1 : 
                            {
                                System.out.println("Enter new roll number");
                                r = S.nextInt();  
                                A[i].roll = r;
                                break;
                            }

                            case 2 : 
                            {
                                System.out.println("Enter updated marks");
                                g = S.nextInt();  
                                A[i].marks = g;
                                break;
                            }

                            case 3 : 
                            {
                                S.nextLine(); // consume newline
                                System.out.println("Enter new name");
                                q = S.nextLine();  
                                A[i].name = q;
                                break;
                            }

                            default :
                            {
                                System.out.println("worng choise");
                            }
                        }

                        updated = true;
                        break;
                    }
                }
                if (!updated) {
                    System.out.println("Student not found");
                }
                break;
            }

            case 5: 
            {
                System.out.println("Exiting...");
                System.exit(0);
                break;
            }

            default :
            {
                System.out.println("worng choise");
            }
        }
    }
    }
}
