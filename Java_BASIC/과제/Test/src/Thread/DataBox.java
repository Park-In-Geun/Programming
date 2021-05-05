package Thread;
public class DataBox {
	private String data;
	
	public synchronized String getData() { 
		//이 메소드는 동기화 되어 있다. 
		//this.data가 null이면 다른 스레드가 알려줄 때 까지 기다린다. 
		if(this.data == null){
			try{
				wait();
			}catch(InterruptedException e){	}
		}
		
		String returnValue = data; 
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		//this.data를 null로 만들고 다른 스레드에게 알려준다. 
		this.data = null;
		notify();
		
		return returnValue;
	} 
	public synchronized void setData(String data) { 
		//이 메소드는 동기화 되어 있다. 
		//this.data가 null이 아니면 다른 스레드가 알려줄 때 까지 기다린다. 
		if(this.data != null){
			try{
				wait();
			}catch(InterruptedException e){	}
		}
		
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		//this.data에 전달되어 온 데이터를 저장하고 다른 스레드에게 알려준다. 
		this.data = data;
		notify();
		
	}

}
