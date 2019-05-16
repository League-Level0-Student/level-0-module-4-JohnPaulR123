PImage chopper;
PImage creeper;
void setup(){
  chopper=loadImage("chopper.jpg");
  creeper=loadImage("creeper.jpg");
  creeper.resize(50,50);
  size(1250,700);
  chopper.resize(1250,700);
  background(chopper);

}

void draw(){
  image(creeper, mouseX, mouseY);
  if(mousePressed){
    
  }
}