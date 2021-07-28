# Flower_Application

This git repo contains our flower recognition application based on java.


The neural network we use to build the model is inception_v3. 
we based on the code from this repo to build the model.
https://github.com/5donuts/flower-classifier

The apk can be found here:

The data set was built using the Crawling.py program located within "Data Set" folder. 
This script search for images in google using the strings given to it within the Flower_names.csv file, build list with all the URLs and then save all the images in the folder "{string search pattern}".
The raw data contains between 300 to 1000 images per flower gen.
The data set data set can be found here:

The augmentation script (which can be found in "Data Set" folder), run over all the images within a folder and can rotate and britghen the images for the purpose of expand the amount of images using for the train data set. Note: you should use this script after you seperate the data set to 3 sets: train,test and validation in order to keep the sets independent. you should keep the ratio  between the amount of images for all flowers.






