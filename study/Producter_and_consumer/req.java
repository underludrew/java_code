/*request entity*/

class req{
   // String request_IP;
   String userName;
   // String type;
   int msgnum;

   // String getRequest_IP(){
   // 	  return this.request_IP;
   // }
   // void setRequest_IP(String ip){
   //    this.request_IP=ip;
   // }

   String getUserName(){
      return this.userName;
   }
   void setUserName(String name){
       this.userName=name;
   }
   
   int getMsgnum(){
   	return this.msgnum;
   }
   void setMsgnum(int n){
   	this.msgnum=n;
   }
   // String getType(){
   // 	  return this.type;
   // }
   // void setType(String type){
   //    this.type=type;
   // }
}