# Spring 2025 Fundamentals of Computing I — Assignment 1

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖・Before You Begin・❖

1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this step and step `3`.
3. Clone your fork, using either the web site or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name and GitHub handle.

---

## ❖・Introduction・❖

For this assignment, you’ll be writing a single program that creates a string based on temperature and random factors.

1. Your program should print your first and last initials in large block letters. Use each letter’s corresponding characters to form the letters. (See the **Example Output** section below.)
2. Next, ask the user to enter a number in Fahrenheit. Your program should convert the value to Celsius and save it. For example, entering `32` should yield `0`.
3. Now take input from the user in the form of a 5-character string, then save the string in reverse *without* the first and last characters. In other words, trim the outside characters. For example, if the user enters `abewz`, your program would save `web`. **You may not use any form of a looping construct.**
4. In this penultimate step, generate and save a random number between 32 – 16,384, inclusive.
5. And, finally, combine the results of steps 2 – 4 and print it to the screen, separating each step by a newline. See the **Example Output** section below.

 **Important Note**: You ***must*** use Make to compile and run your program. A Makefile has been included. See below.

---

## ❖・File List・❖

This repo contains the following files, all required to carry out this assignment. Before you start working, ensure you understand the role of each file below.

1. `Makefile` — Run `make` in your command line interface, or CLI, from this repo’s root folder to build your assignment. As you test input, run `make run` to *only* run a previously-compiled Java program, not compile it.
2. `.editorconfig` — Everything in this file is a redundancy of what’s already in the `.editorconfig` file you installed in your home folder during the first week of class. It’s here to make sure you’re working with the formatting rules defined in `.editorconfig`, as this is part of your grade. **Do not move this file.** Also, **ensure EditorConfig is working in VS Code, *before* beginning this assignment.**
3. `.gitignore` — **Do not modify this file.**
4. `Assignment1.java` — Where you will do your assignment. **Do not** write your code in anything *other* than this file.

---

## ❖・Example Output・❖

If I was creating this program, it’s output would look like this:

```bash
RRRRRRRR    VVV         VVV
RRR    RRR   VVV       VVV
RRR    RRR    VVV     VVV
RR RRR         VVV   VVV
RRR  RRR        VVV VVV
RRR    RRR       VVVVV
RRR      RRR      VVV

Please enter a number in Fahrenheit:
32

Please enter a 5-character string:
abewz

Generating random number. Continuing...

Your new string is 0.0web15769
```

---

## ❖・Grading・❖

| Item                                           | Points |
|------------------------------------------------|:------:|
| Program works according to instructions        | `34`   |
| Code compliant with EditorConfig rules         | `33`   |
| Code is neat and variable names are logical    | `33`   |

---

## ❖・Due・❖

Tuesday, 18 February 2024, at 5:00 PM. ***Note*: Per the syllabus, NO late submissions will be accepted**

---

## ❖・Submission・❖

You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may *only* be submitted via GitHub. **No other form of submission will be accepted**.
