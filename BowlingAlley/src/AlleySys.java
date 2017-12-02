
public class AlleySys {

	static Frame[] frames=new Frame[10];
	private static int total=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame fr1=new Frame(3,4);
		Frame fr2=new Frame(1,5);
		Frame fr3=new Frame(2,4);
		Frame fr4=new Frame(3,4);
		Frame fr5=new Frame(6,4);
		Frame fr6=new Frame(5,2);
		Frame fr7=new Frame(2,5);
		Frame fr8=new Frame(10);
		Frame fr9=new Frame(10);
		Frame fr10=new Frame(1,1,7);
		
		frames[0]=fr1;
		frames[1]=fr2;
		frames[2]=fr3;
		frames[3]=fr4;
		frames[4]=fr5;
		frames[5]=fr6;
		frames[6]=fr7;
		frames[7]=fr8;
		frames[8]=fr9;
		frames[9]=fr10;
		
		for(int i=0;i<9;i++){
			frames[i].calcFrame(getNextBall(i), getNextNextBall(i));
		}
		
		frames[9].calcFrame(frames[9].ball1, frames[9].ball2, frames[9].ball3);   //frame 10th may have additional ball
		
		for(int i=0;i<=9;i++){
			 total=total+frames[i].score;
		}
		 System.out.println("Total score: "+total);

	}

	public static int getNextBall(int index){  //+1 incase of strike or spare
		++index;
		return frames[index].ball1;
	}
	
	public static int getNextNextBall(int index){      //+2 incase of strike
		++index;
		if((index!=9)&(frames[index].ball1!=10)){
			return frames[index].ball2;
		}
		else if((index==9) &(frames[index].ball1==10)){
			return frames[index].ball2;
		
		}
		else{
			if(index==9){
				return frames[index].ball2;
			}
			else{
			++index;
			return frames[index].ball1;
			}
		}
	}
}
