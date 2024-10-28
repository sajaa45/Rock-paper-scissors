import random
class winner :
    def __init__ (self,one,two,p):
        self.one= one
        self.two= two
        self.p=p
    
    def determination(self):
        one=self.p.index(self.one)
        two=self.p.index(self.two)
        s=one-two
        if s==1 or s==-2 :
                print("You won! Congratulations")
        elif s==0:
            print("You are even!")
        else:
            print("You Lost! Try again")
    
    

def robot(p):
    y=random.choice(p)
    print("Robot choice was ",y)
    return y

def write():
    x = input("Choose one: Rock, Paper, Scissors\n").strip().lower()
    print("You chose:", x) 
    return x

def play_game():
    p = ['rock', 'paper', 'scissors']
    choice = write()
    while choice not in p:
        print("Rewrite your choice")
        choice=write()
    computer_choice=robot(p)
    game=winner(choice,computer_choice,p)
    game.determination()
    
while True:
    play_game()
    p=input("Do you want to try again?(yes/no)\n").strip().lower()
    if p!="no":
        print("Let's try again")
    else:
        print("Thank you for playing!")
        break