SUMMARY = "Kiosk image"

LICENSE = "CLOSED"

inherit core-image

# Include and build the Chromium package and X
IMAGE_INSTALL:append = " chromium-x11"
IMAGE_FEATURES:append = " x11-base hwcodecs"