
public enum HandSign {
	Goo{
		public String judge(HandSign sign){
			if(Goo == sign){
				return "あいこ";
			}else if(sign == Pa){
				return "かち";
			}else{
				return "まけ";
			}
		}
	},
	Choki{
		public String judge(HandSign sign){
			if(sign == Choki){
				return "あいこ";
			}else if(sign == Pa){
				return "かち";
			}else{
				return "まけ";
			}
		}
	},
	Pa{
		public String judge(HandSign sign){
			if(sign == Pa){
				return "あいこ";
			}else if(sign == Goo){
				return "かち";
			}else{
				return "まけ";
			}
		}
	};
	public static String pon(HandSign playerHand, HandSign computerHand){
		return playerHand.judge(computerHand);
	}
	abstract public String judge(HandSign sign);

}
