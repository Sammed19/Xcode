#We wanted to make the program more efficient with
#less lines of code. Let's try it out:

#let's make a Rock Paper Scissors game!

#first, let's import the random procedure so our PC is unpredictable
import random

#then, let's make a set of moves the PC can choose from:
moves = ["rock", "paper", "scissors"]

#Now let's get coding our game:
# I would like to have this loop forever, so let's make a "switch" for the game
keep_playing = "true"

#Now we loop the program based on that switch:
while keep_playing == "true":
    #have the computer (cmove) choose randomly from the set of moves above
    cmove = random.choice(moves)
    #this allows the player to enter their move
    pmove = input("What is your move: rock, paper or scissors?")
    #now time to say what the PC chose:
    print ("The computer chose",cmove)
    #now we start logically defining the outcomes:
    #let's be lazy and grab all possible tie outcomes at once:
    if cmove == pmove:
        print ("Tie")
        #this is already enhanced


        
    #now time to make this more efficient:
    elif pmove == "rock":
        if cmove == "scissors":
            print ("Player wins")
        elif cmove == "paper":
            print ("Computer wins")
    elif pmove == "scissors":
        if cmove == "rock":
            print ("Computer wins")
        elif cmove == "paper":
            print ("Player wins")
    elif pmove == "paper":
        if cmove == "scissors":
            print ("Computer wins")
        elif cmove == "rock":
            print ("Player wins")
		else
			print("invalid,try again")

    #what makes this more efficient is that the
    #computer has to less processing and checking
    #of variables and statuses of items.

#over 10000000000000 iterations of this code
#we can see how it could save computer cycles
