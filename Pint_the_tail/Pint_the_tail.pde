PImage donkey;
PImage tail;
void setup(){
  tail=loadImage("tail.png");
  donkey=loadImage("eeyore.jpg");
  size(800,500);
  donkey.resize(800,500);
  tail.resize(200,200);
  rect(0, 0, 30, 30);
  rect(268, 126, 40, 40);

}
void draw(){
  background(donkey);
  image(tail,mouseX,mouseY-90);
   if(mousePressed){
  println(mouseX, mouseY);
   }    
}