import turtle
import time


screen = turtle.Screen()
screen.bgcolor("black")
screen.title("Simple Animation")


anim_turtle = turtle.Turtle()
anim_turtle.shape("turtle")
anim_turtle.color("cyan")
anim_turtle.speed(0)


for i in range(36):
    anim_turtle.forward(100)
    anim_turtle.right(60)
    anim_turtle.forward(100)
    anim_turtle.right(120)
    anim_turtle.forward(100)
    anim_turtle.right(60)
    anim_turtle.forward(100)
    anim_turtle.right(100)
    anim_turtle.right(10)


time.sleep(3)
screen.bye()