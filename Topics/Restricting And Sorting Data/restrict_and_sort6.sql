select last_name "Employee", salary "Monthly Salary" from employees
where salary between 5000 and 12000 and dept_ID in (20, 50);

