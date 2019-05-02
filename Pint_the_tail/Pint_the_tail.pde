PImage donkey;
PImage tail;
int x;
int y;
boolean finished=false;
void setup(){
  tail=loadImage("tail.png");
  donkey=loadImage("eeyore.jpg");
  size(800,500);
  donkey.resize(800,500);
  tail.resize(200,200);


}
void draw(){
  if(finished){
    background(donkey);
  }
  else{
  if (dist(0, 0, mouseX, mouseY) < 30){
   background(donkey);
  }
  else{
   rect(0,0,800,500); 
  }
  }
  if(!finished){
  x=mouseX-5;
  y=mouseY-85;
  }
  image(tail,x,y);
   if(mousePressed){
     if(mouseX>260 && mouseX<290 && mouseY>106 && mouseY<136){
       println("got it");
       finished=true;
     }
     else{
      println("try again"); 
     }
 // println(mouseX, mouseY);
   }    
}