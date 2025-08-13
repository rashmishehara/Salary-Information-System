Salary Information System

📌 Overview

The Salary Information System is a simple console-based application that allows users to calculate three salary-related details:

01. Income Tax
02. Annual Bonus
03. Loan Amount

The program prompts the user to select an option, takes input such as employee name, monthly salary, and other relevant details, then displays the calculated results according to the selected feature.

✨ Features

1️⃣ Calculate Income Tax
Calculates monthly Income Tax based on Sri Lankan tax slabs.

No tax for salaries up to Rs. 100,000.

Tax rates increase progressively as per the salary range:

Salary Range (Monthly)	Tax Rate
Rs. 100,000 – Rs. 141,667	6%
Rs. 141,667 – Rs. 183,333	12%
Rs. 183,333 – Rs. 225,000	18%
Rs. 225,000 – Rs. 266,667	24%
Rs. 266,667 – Rs. 308,333	30%
Above Rs. 308,333	36%

💡 Example: A salary of Rs. 250,000 results in Rs. 21,000 monthly tax.

2️⃣ Calculate Annual Bonus
Calculates Annual Bonus based on salary ranges:

Monthly Salary Range	Bonus Amount / Rate
Less than Rs. 100,000	Rs. 5,000 fixed
Rs. 100,000 – Rs. 199,999	10% of salary
Rs. 200,000 – Rs. 299,999	15% of salary
Rs. 300,000 – Rs. 399,999	20% of salary
Above Rs. 400,000	35% of salary

3️⃣ Calculate Loan Amount
Calculates the maximum loan an employee can take based on:
- Salary must be greater than Rs. 50,000.
- Loan installment cannot exceed 60% of monthly salary.
- Maximum loan period: 5 years.
- Annual interest rate: 15%.

Uses a leasing formula to determine the eligible loan amount.
Loan amount is rounded to the nearest Rs. 1,000.
