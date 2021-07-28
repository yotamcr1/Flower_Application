import cv2
import numpy as np
import os

from PIL import ImageEnhance, Image
from scipy import ndimage
import imageio

def rotate_picture(picture, deg, path, name):
    """
    get picture and rotate by degree and save to path
    :param picture:
    :param deg:
    :param path:
    :return:
    """
    rotate_pic = ndimage.rotate(picture, deg, reshape=False)
    imageio.imsave(os.path.join(path, f"{name}_rotate_{deg}.png"), rotate_pic)

def rgb2gray(rgb):
    """
    make picture grey
    :param rgb:
    :return:
    """
    return np.dot(rgb[...,:3], [0.299, 0.587, 0.144])

def brighten_picture(picture, factore, path, name):
    """
    make the picture bright/dark
    :param factore:
    :param picture:
    :param path:
    :return:
    """
    picture = Image.open(picture)
    enhancer = ImageEnhance.Brightness(picture)
    im_output = enhancer.enhance(factore)
    im_output.save(os.path.join(path, f"{name}_bright_{factore}.png"))


#os.chdir("D:\\Images\\middle_pictures\\train")
os.chdir("C:\\data_set")
folder_list = os.listdir()
for folder in folder_list:
    flower_folder = os.path.join(folder)
    pictures_list = os.listdir(flower_folder)
    pictures_path_list = []
    for picture in pictures_list:
        picture_path = os.path.join(flower_folder, picture)
        pictures_path_list.append(picture_path)
    counter = 0
    for image in pictures_path_list:
        counter+=1
        image_current = Image.open(image)
        image_current.thumbnail((300,300))
        image_current.save(image)

        print(counter,len(pictures_path_list))
        picture_name = os.path.split(image)[-1].split(".")[0]
        folder_path = os.path.join(image, "..")
        picture = imageio.imread(image)
        i = 1
        while (i < 360):
            rotate_picture(picture, i, folder_path, picture_name)
            i += 60
        print("finish rotate")
        i = 0.7
        while (i < 2):
            brighten_picture(image, i, folder_path, picture_name)
            i += 0.5
        print("finish brighten")
        i = 1






