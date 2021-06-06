// Modules 
require('dotenv').config();
const express = require('express');
const ejs = require('ejs');
const mongoose = require('mongoose');
const encrypt = require('mongoose-encryption');

// Settings
const app = express();
app.use(express.urlencoded({extended:false}));
app.set('view engine', 'ejs');
app.use(express.static('public'));

// Mongo DB
mongoose.connect('mongodb://localhost:27017/authentication', {useNewUrlParser: true, useUnifiedTopology: true}, (err) => {
    if (!err) {
        console.log("Connected to DB")
    }
});

const userSchema = new mongoose.Schema({
    email: String,
    password: String
})


userSchema.plugin(encrypt, { secret: process.env.SECRET, encryptedFields: ['password'] });

const users = mongoose.model('User', userSchema);

// Get
app.get('/', (req, res) => {
    res.render('home');
})
app.get('/login', (req, res) => {
    res.render('login');
})
app.get('/register', (req, res) => {
    res.render('register');
})
app.get('/secrets', (req, res) => {
    res.render('secrets');
})
app.get('/submit', (req, res) => {
    res.render('submit');
})

// Post
app.post('/register', (req, res) => {
    const email = req.body.username;
    const password = req.body.password;
    const user = new users ({
        email: email,
        password: password
    })
    user.save((err) => {
        if (!err) {
            console.log("New data saved");
        } else {
            console.log(err);
        }
    })
})

app.post('/login', (req, res) => {
    const email = req.body.username;
    const password = req.body.password;
    users.findOne({email: email}, (err, found) => {
        if (!err) {
            if (found) {
                console.log(found);
                if (found.password === password) {
                    res.render('secrets');
                }
            } else {
                res.render('login');
            }
        }
    })
})

// Server status
app.listen(8080, () => {
    console.log("Server 8080 is running")
})