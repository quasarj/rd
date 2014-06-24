#!/usr/bin/env python2

import random
random.seed()

def roll_d6():
    return random.randint(1, 6)

def count_hits(rolls):
    count = 0
    for i in rolls:
        if i >= 5:
            count += 1
    return count

def count_misses(rolls):
    count = 0
    for i in rolls:
        if i == 1:
            count += 1
    return count

def score_rolls(rolls):
    hits = count_hits(rolls)
    misses = count_misses(rolls)

    if misses >= len(rolls) / 2.0:
        if hits == 0:
            return "CRITICAL GLITCH"
        else:
            return "Glitch"
    return hits


def roll(dice):
    rolls = []
    for i in range(dice):
        rolls.append(roll_d6())

    return (score_rolls(rolls), rolls)

def test():
    assert score_rolls([1, 2, 2, 3]) == 0
    assert score_rolls([6, 6, 6, 6]) == 4
    assert score_rolls([1, 1, 2, 5]) == "Glitch"
    assert score_rolls([1, 1, 2, 3]) == "CRITICAL GLITCH"
    assert score_rolls([1, 1, 2]) == "CRITICAL GLITCH"
    assert score_rolls([1, 2, 2]) == 0
    assert score_rolls([1, 1, 1, 2, 2]) == "CRITICAL GLITCH"
    assert score_rolls([1, 1, 1, 2, 6]) == "Glitch"
    assert score_rolls([1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 
                        4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6]) == 7

if __name__ == '__main__':
    print "Performing self test..."
    test()
    print "All tests passed! Looks like your environment is sane.\n"

    while True:
        dice = raw_input("How many dice to roll? ")
        if dice in ['exit', 'quit', 'q']:
            break
        try:
            dice = int(dice)
        except:
            print "Unrecognized input. Integers only, please!"
            print
            continue

        result, details = roll(dice)
        details.sort()
        print "Result: {}".format(result)
        print "Details: {}".format(details)
        print


