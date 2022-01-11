package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissor {
    public static void main(String[] args) {
        String op = "Yes";
        while (op.equals("Yes")) {
            Scanner in = new Scanner(System.in);

            System.out.println("Welcome to Rock, Paper, Scissor Bot Game! ");
            System.out.println("Enter your choice (Rock , Paper ,Scissor) : ");

            String ch = in.nextLine();

            if (ch.equals("Rock")) {
                bot(0);
            } else if (ch.equals("Paper")) {
                bot(1);
            } else if (ch.equals("Scissor")) {
                bot(2);
            } else {
                System.out.println("Invalid input.");
            }

            System.out.println("Do you want to continue playing? (Yes/No) :");
            Scanner c = new Scanner(System.in);
            op = c.next();
        }

    }
            static void bot ( int n)
            {
                int num = ThreadLocalRandom.current().nextInt(0, 3);
                if (num == 0 || num == 1 || num == 2) //rps
                {
                    if (num == 0)
                        System.out.println("Bot says Rock.");

                    else if (num == 1)
                        System.out.println("Bot says Paper.");

                    else
                        System.out.println("Bot says Scissor.");

                    System.out.println(answer(num, n));
                }
            }

            static String answer ( int num, int n)
            {
                if (num == n) {
                    return "Tie!";
                } else if (n == 1 && num == 0 || n == 0 && num == 1) {
                    if (n == 1)
                        return "You won!";
                    else
                        return "You lose. Better luck next time!";
                } else if (n == 2 && num == 0 || n == 0 && num == 2) {
                    if (n == 2)
                        return "You lose. Better luck next time!";
                    else
                        return "You won!";
                } else {
                    if (n == 1)
                        return "You lose. Better luck next time!";
                    else
                        return "You won!";
                }
            }

    }


