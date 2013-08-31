calculation service stories

Scenario: calculates sum of two values (less than int max)

Given the system is ready
When I sum  5 and 10
Then the result should equal to 15

Scenario: calculates sum of two values (equal to int max)

Given the system is ready
When I sum  1073741823 and 1073741824
Then the result should equal to 2147483647