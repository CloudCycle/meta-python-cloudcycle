
SUMMARY = "A Python utility / library to sort Python imports."
HOMEPAGE = "https://pycqa.github.io/isort/"
AUTHOR = "Timothy Crosley <timothy.crosley@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/ab/e9/964cb0b2eedd80c92f5172f1f8ae0443781a9d461c1372a3ce5762489593/isort-5.10.1.tar.gz"
SRC_URI[md5sum] = "717294d0a9017b27bd46b1c946b39bd0"
SRC_URI[sha256sum] = "e8443a5e7a020e9d7f97f1d7d9cd17c88bcb3bc7e218bf9cf5095fe550be2951"

S = "${WORKDIR}/isort-5.10.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
