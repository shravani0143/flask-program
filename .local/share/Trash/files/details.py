from flask import Flask
app = Flask(__name__)
@app.route('/')
def clg():
    return """
    <h1>College Details</h1>
    <hr>
    <b>College Name:</b> ABC College<br><br>
    <b>College Address:</b> 123 Main Street, City, Country<br><br>
    <b>Course:</b>
    <ul>
        <li>Bachelor of Science (B.Sc)</li>
        <li>Bachelor of Arts (B.A)</li>
        <li>Bachelor of Commerce (B.Com)</li>
    </ul>
    <b>College Contact:</b> +1 234 567 890<br><br>
    <b>College Email:</b>
    <b>Website:</b>www.abccollege.edu<br><br>
    """
if __name__ == '__main__':
    app.run(debug=True)