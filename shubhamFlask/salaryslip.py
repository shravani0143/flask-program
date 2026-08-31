from flask import Flask
app = Flask(__name__)
@app.route('/')
def salary():
  emp_id = 1001
  name = "Shubham Narwade"
  department = "IT"
  basic_salary = 50000
  hra = basic_salary * 0.20
  da = basic_salary * 0.12
  ta = basic_salary * 0.08
  pf = basic_salary * 0.10
  gross_salary = basic_salary + hra + da + ta
  net_salary = gross_salary - pf
  return f"""
  <h1>Employee Salary Slip</h1>
  <hr>
   Employee ID : {emp_id}<br><br>
   Name : {name}<br><br>
   Department : {department}<br><br>
   Basic Salary : Rs{basic_salary}<br><br>
   HRA (20%) : Rs{hra}<br>
   DA (12%) : Rs{da}<br>
   TA (8%): Rs{ta}<br>
   PF (10%): Rs{pf}<br><br>
   <b>Gross Salary:</b> Rs{gross_salary}<br><br>
   <b>Net salary:</b> Rs{net_salary}<br><br>
   """
if __name__ == "__main__":
 app.run(debug=True)

