from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def home():
    name = "John"
    return render_template("home.html", name=name)

@app.route('/about')
def about():
    title = "About Us"
    description = "This application is developed using Flask Framework."
    return render_template("about.html", title=title, description=description)

if __name__ == "__main__":
    app.run(debug=True)