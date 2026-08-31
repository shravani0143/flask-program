from flask import Flask, render_template

app = Flask(__name__)

# Employee data
employees = [
    {
        "id": 1,
        "name": "Rahul Sharma",
        "department": "IT",
        "position": "Software Developer",
        "experience": 1
    },
    {
        "id": 2,
        "name": "Priya Patil",
        "department": "HR",
        "position": "HR Executive",
        "experience": 3
    },
    {
        "id": 3,
        "name": "Amit Joshi",
        "department": "Finance",
        "position": "Accountant",
        "experience": 6
    },
    {
        "id": 4,
        "name": "Sneha Kulkarni",
        "department": "IT",
        "position": "Web Developer",
        "experience": 2
    },
    {
        "id": 5,
        "name": "Vijay Deshmukh",
        "department": "Sales",
        "position": "Sales Manager",
        "experience": 10
    }
]


@app.route("/")
def home():
    return render_template("home.html")


@app.route("/employees")
def employee_list():
    return render_template("employees.html", employees=employees)


@app.route("/department")
def department():
    departments = [
        "IT",
        "HR",
        "Finance",
        "Sales"
    ]

    return render_template(
        "department.html",
        departments=departments
    )


if __name__ == "__main__":
    app.run(debug=True)
