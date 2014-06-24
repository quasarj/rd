#!/usr/bin/env python2

import numpy
import random
random.seed()

def roll_d6():
    return random.randint(1, 6)

def count_hits(rolls):
    return len([i for i in rolls if i >= 5])

def count_misses(rolls):
    return len([i for i in rolls if i == 1])

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

def print_details(rolls):
    print "Details:"
    print "# C"
    width = 50
    total = float(len(rolls))
    counts, bins = numpy.histogram(rolls, bins=[1, 2, 3, 4, 5, 6, 7])
    m = float(max(counts))
    for i, c in enumerate(counts):
        print i + 1, c, int((c / m) * width) * '=' + '>'
        # print i + 1, c, int((c / m) * width)

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
        try:
            dice = raw_input("How many dice to roll? ")
        except:
            print
            break

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
        print_details(details)
        print


