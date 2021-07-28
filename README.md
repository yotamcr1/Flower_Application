# Flower_Application

This git repo contains our flower recognition application based on java.

The apk can be found here:

The data set was built using the Crawling.py program located within "Data Set" folder. 
This script search for images in google using the strings given to it within the Flower_names.csv file, build list with all the URLs and then save all the images in the folder "{string search pattern}".
The raw data contains between 300 to 1000 images per flower gen.
The data set data set can be found here:

The augmentation script (which can be found in "Data Set" folder), run over all the images within a folder and can rotate and britghen the images for the purpose of expand the amount of images using for the train data set. Note: you should use this script after you seperate the data set to 3 sets: train,test and validation in order to keep the sets independent. you should keep the ratio  between the amount of images for all flowers.

The  neural network we use to build the model is inception_v3. 

we based on the code from this repo to build the model.
https://github.com/5donuts/flower-classifier

this repo is very infomative and we implements 3 steps to train the model: unify the size of the images, randomanly seperate the data sets into 3 dictionaries: validation, test and train, and finally train the model. 
We edit the code a little bit in order to save the model and convert it to TensorFlow Lite so it can be integrated easily into our app. 

In order to install the app on an android device, one can download the following apk:
https://drive.google.com/file/d/1RwQKo-EuzcrvU_QcCbQ1LRvcD9HOHAht/view?usp=sharing
The app was built and design over Samsung Galaxy A71 (and test only on this device).


The Project used open sources projects, all of them under the licence of APACHE 2 which can be found here:

https://www.apache.org/licenses/LICENSE-2.0

This project also realse under the licence of APACHE 2.








