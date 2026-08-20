from flask import Flask
app= Flask(__name__)
@app.route('/')
def college():
    return """
    <h1>College Details</h1>
    <hr>
    <b>College Name :</b> XYZ College of Engineering<br><br>
    <b>Address :</b> Kothrud, Pune<br><br>
    <b>Principal :</b> Dr. Anil Patil<br><br>
    <b>Courses :</b>
    <ul>
    <li>B.Tech</li>
    <li>M.Tech</li>
    <li>B.Sc</li>
    <li>M.Sc</li>
    </ul>
    <b>Contact Number :</b> 1234567890<br><br>
    <b>Email :</b> info@xyzcollege.com<br><br>
    <b>Website :</b> www.xyzcollege.com 
    """
if __name__ == "__main__":
    app.run(debug=True) 