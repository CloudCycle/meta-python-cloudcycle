
SUMMARY = "versionner helps manipulating version of the project."
HOMEPAGE = "http://msztolcman.github.io/versionner/"
AUTHOR = "Marcin Sztolcman <marcin@urzenia.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=e5fc539ce69c2d978d32c3d61a57bdfb"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/04/cb/4b44f9c372add15d0eb969214a171549644e0e0cc9c2d56af348008fbf90/versionner-1.5.3.tar.gz"
SRC_URI[md5sum] = "795d11618feb2909ea23b862684e7e8e"
SRC_URI[sha256sum] = "daef6dc71a65a71e9d8541bf3b7de07cad247e90ec3c0f960ef9865b77760a11"

S = "${WORKDIR}/versionner-1.5.3"

DEPENDS += " "
RDEPENDS_${PN} = "python3-argparse python3-semver"

BBCLASSEXTEND = "native nativesdk"
