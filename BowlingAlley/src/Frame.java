
public class Frame {

	int ball1, ball2;
	int score;
	int ball3;
	
	Frame(int ball1){
		this.ball1=ball1;
	}
	
	Frame(int ball1,int ball2){
		this(ball1);
		this.ball2=ball2;
	}
	
	
	Frame(){
		//getFrame();
	}
	
	public Frame(int ball1,int ball2,int ball3) {
		this(ball1,ball2);
		this.ball3=ball3;
	}

	void calcFrame(int nextBall1,int nextBall2){
		if(ball1==10){
			score=ball1;
			System.out.println("Strike");
			calcStrike(nextBall1,nextBall2);
		}
		else 
			if((ball1+ball2)!=10){
				score=ball1+ball2;
				System.out.println("Score: "+score);
			}
		
			else
			{
				score=ball1+ball2;
				System.out.println("Spare");
				calcSpare(nextBall1);
			}
	}
	
	
	void calcStrike(int nextBall1,int nextBall2){  //strike logic  frame 1-9
		if(nextBall1!=10){
			score=score+nextBall1+nextBall2;
			System.out.println("Score: "+score);
		}
		else
		{
			score=score+nextBall1+nextBall2;
			System.out.println("Score: "+score);
			
		}
	}
	
	void calcSpare(int nextBall1){   //spare logic frame 1-9
		score=score+nextBall1;
		System.out.println("Score: "+score);
	}

	public void calcFrame(int ball1, int ball2, int ball3) {   //overloading for 10th frame
		if(ball1==10){                        //stike 
			score=score+ball1+ball2+ball3;
		}
		else if(ball1+ball2==10){           //spare
			score=score+ball1+ball2+ball3;
		}
		else{
			score=score+ball1+ball2;
		}
		System.out.println("Score: "+score);
	}
}
