import turtle
import time

# Set up the screen
screen = turtle.Screen()
screen.bgcolor("black")
screen.title("Simple Animation")

# Create a turtle
anim_turtle = turtle.Turtle()
anim_turtle.shape("turtle")
anim_turtle.color("cyan")
anim_turtle.speed(0)

# Animation loop
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

# Pause before closing
time.sleep(3)
screen.bye()