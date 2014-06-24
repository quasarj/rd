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

def count_ones(rolls):
    count = 0
    for i in rolls:
        if i == 1:
            count += 1
    return count

def judge_rolls(rolls):
    hits = count_hits(rolls)
    misses = count_ones(rolls)

    if misses >= len(rolls) / 2:
        if hits == 0:
            return "CRITICAL GLITCH"
        else:
            return "Glitch"
    return hits


def roll(dice):
    rolls = []
    for i in range(dice):
        rolls.append(roll_d6())

    return (judge_rolls(rolls), rolls)

def test():
    assert judge_rolls([1, 2, 2, 3]) == 0
    assert judge_rolls([1, 1, 2, 5]) == "Glitch"
    assert judge_rolls([1, 1, 2, 3]) == "CRITICAL GLITCH"

if __name__ == '__main__':
    print "Performing self test..."
    test()

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


