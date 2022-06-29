public class getroot {
public static void main(String[] args) {
	double A=1.0;
	for(double D=0.1;D>0.000001;D=D/10) {
		if((A+D)*(A+D)<=2) {
			A=A+D;
			D=10D;
		}else {
			System.out.println(A);
		}
	}
	}
}