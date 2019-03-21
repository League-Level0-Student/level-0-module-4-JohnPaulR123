PImage donkey;
PImage tail;
void setup(){
  tail=loadImage("donkey.png");
  donkey=loadImage("eeyore.jpg");
  size(800,500);
  donkey.resize(800,500);
}
void draw(){
  background(donkey);
  image(tail,mouseX,mouseY);
}