Pretest : 
Aptitude (basic quant & reasoning). "Topics : apti, english, problem-solving(java) and dbms objective type"
English and workplace questions. "Behavioural and scenario-based questions * Workplace professionalism and etiquette * Error correction (grammar/usage)"
DBMS / SQL (queries, joins, normalization, ACID). "SQL queries up to and including JOINs * Two-table questions — given two tables, write the query that produces the result"



Core Java concepts and pseudocode. "Core Java concepts covered: * OOPs principles * Interfaces and inner classes * Packages and access modifiers * Collections framework"
Objective-style code reading and output prediction. "Pseudo-code questions (lengthy — read carefully): * Predict the output of a given code snippet * Identify whether the code compiles / executes successfully"

Total questions ~60, 90 minutes, need ~65% (~39/60) to pass
Section split example: Java ~25, DBMS ~10, Apti ~10, English ~10
Practice SQL joins, normalization, and two-table problems
Focus on fundamentals and practice pseudocode outputs

After pretest you will be having a 3-4 months stream training where every thing will be from scratch (from language level). You will have 4 assessments, 40 marks for mcqs 60 for hands on. For last assessment you will have a project instead of assessment. You will also have mini projects 




Total questions---60

Duration---90 min

Passing score---65%

Minimum marks--- 39 / 60

Scoring 39 or above gives you the option to choose your preferred stream. Aim for at least 39 to unlock that choice.

Section 1 — Aptitude -- 10 questions

    Data sufficiency

    Percentages

    Data interpretation

    Ranking

    Inequality-based reasoning (e.g. a > b < n ≥ i < p — is p less than a?)

    Number series

    Mixtures and alligations

Section 2 — English & L&D -- 15 questions

    Behavioural and scenario-based questions

    Workplace professionalism and etiquette

    Error correction (grammar/usage)

Section 3 — DBMS / SQL -- 10 questions

    SQL queries up to and including JOINs

    Two-table questions — given two tables, write the query that produces the result

    Two-table questions — given a SQL query, identify the output table/view

    Normalization

    ACID properties

    DBMS theory and concepts

Section 4 — Problem solving (Java) -- 25 questions

Core Java concepts covered:

    OOPs principles

    Interfaces and inner classes

    Packages and access modifiers

    Collections framework

    Errors and exceptions

Pseudo-code questions (lengthy — read carefully):

    Predict the output of a given code snippet

    Identify whether the code compiles / executes successfully

    Answer concept-based questions based on the code shown




1experience :
Will be conducted on Day5
To gauge your knowledge prior to FP training
Topics: Python, UNIX, Git, Angular / React
Assessment type: Objective, 25% negative marks is applicable for wrong answers
Duration: 100 mins
Those who will qualify in Pretest will be allocated to AI Streams
Difference in your scores before and after the FP training will be analyzed
Pretest scores will not be included in overall training average but will be part of Training Dossier

analysis of 

Your sample is 60 questions / 90 minutes, with 39/60 required, and Java alone is ~42% of the paper. So I’d prioritize:

    Java — highest priority

    SQL + DBMS

    Aptitude

    English / workplace scenarios

A good target is 48–50+ in practice, so that a difficult paper still leaves you above 39.
What to study
1. Java — 25 questions

Focus on these in order:

    OOP:

        class/object

        inheritance

        polymorphism

        abstraction

        encapsulation

        method overloading vs overriding

        this vs super

        constructors

        static and final

    Access modifiers:

        public

        private

        protected

        default

    Interfaces

    Abstract classes

    Inner classes

    Packages

    Collections:

        ArrayList

        LinkedList

        HashSet

        TreeSet

        HashMap

        TreeMap

        Queue

        differences between them

    Exceptions:

        checked vs unchecked

        try/catch/finally

        throw vs throws

        exception hierarchy

    Code/output questions

Most important: Don't just read Java theory. Practice predicting output.

For example:

class A {
    int x = 10;

    void show() {
        System.out.println(x);
    }
}

class B extends A {
    int x = 20;

    void show() {
        System.out.println(x);
    }
}

A obj = new B();
obj.show();

You need to immediately recognize runtime polymorphism → B's show() → 20.

The Infosys-style questions can be tricky because several concepts may appear in one snippet.
2. SQL + DBMS — 10 questions

You don't need to become a SQL expert. Get extremely comfortable with these.
SQL

Master:

SELECT
FROM
WHERE
ORDER BY
GROUP BY
HAVING
DISTINCT

Then:

INNER JOIN
LEFT JOIN
RIGHT JOIN

And:

COUNT()
SUM()
AVG()
MIN()
MAX()

Also know:

    AND, OR, NOT

    IN

    BETWEEN

    LIKE

    IS NULL

    aliases

    subqueries

    primary key

    foreign key

Especially practice JOIN questions

Suppose:

Employee
id	name	dept_id
1	A	10
2	B	20
3	C	10

Department
dept_id	dept
10	IT
20	HR

Question:

    Display employee name and department name.

You should instantly write:

SELECT e.name, d.dept
FROM Employee e
JOIN Department d
ON e.dept_id = d.dept_id;

Also practice the reverse: given a query, determine the resulting table.
DBMS theory

Know:

    DBMS vs RDBMS

    Primary key

    Foreign key

    Candidate key

    Super key

    Composite key

    Constraints

    Normalization

    1NF, 2NF, 3NF

    Functional dependency

    ACID

    Transactions

    COMMIT

    ROLLBACK

    DELETE vs DROP vs TRUNCATE

    indexes/basic idea of indexing

For ACID, remember:

A — Atomicity → all or nothing
C — Consistency → valid state → valid state
I — Isolation → concurrent transactions don't interfere incorrectly
D — Durability → committed data survives failure
3. Aptitude — 10 questions

Don't spend weeks studying every aptitude topic.

Your listed topics are quite specific.
Priority order

1. Percentages

Know:

    percentage increase/decrease

    successive percentage change

    profit/loss

    percentage comparison

Example:

    Salary increases by 20% and then decreases by 20%.

Don't say 0%.

100×1.2×0.8=96

So it's a 4% decrease.

2. Number series

Practice identifying:

        / -

    × / ÷

    squares/cubes

    alternating patterns

    differences

    second differences

Example:

2, 6, 12, 20, 30, ?

Differences:

4, 6, 8, 10

Next = 12

Answer = 42

3. Ranking

Know questions like:

    A is 12th from the top and 18th from the bottom. How many students?

12+18−1=29

4. Inequalities

These can be fast marks once you understand the logic.

Example:

a > b < n ≥ i < p

You cannot automatically compare p and a.

Don't assume relationships that aren't explicitly connected.

5. Data sufficiency

The trick is usually not solving the problem fully.

You determine whether:

    Statement I alone is sufficient

    Statement II alone is sufficient

    Both together are sufficient

    Neither is sufficient

6. Mixtures/alligation

Learn the basic alligation formula and practice 10–15 questions.

7. Data interpretation

Practice reading:

    tables

    bar graphs

    pie charts

    percentages

The important skill is speed, not advanced mathematics.
4. English + L&D — 15 questions

This section is interesting because it isn't just English grammar.

Based on your sample, I'd divide preparation into:
Grammar

Focus on:

    subject-verb agreement

    tenses

    articles

    prepositions

    pronouns

    sentence correction

    active/passive

    basic vocabulary

    punctuation

Example:

    Each of the employees are responsible.

Wrong.

    Each of the employees is responsible.

Workplace scenarios

This is where you should think:

professional + ethical + collaborative + solution-oriented

For example:

    Your teammate makes a mistake that affects your project. What should you do?

Usually the best answer isn't:

    blame them

    complain immediately

    ignore it

It's closer to:

    Discuss the issue professionally with the teammate, understand what happened, and work together to correct it; escalate appropriately if necessary.

Look for answers demonstrating:

    professionalism

    communication

    teamwork

    accountability

    respect

    ethical behavior

    appropriate escalation

