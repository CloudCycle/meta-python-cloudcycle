
SUMMARY = "Controller Area Network interface module for Python"
HOMEPAGE = "https://github.com/hardbyte/python-can"
AUTHOR = "python-can contributors <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/1f/f7/a643cba269d59e108fe4c1854a8e71d5cdadadd4de1b9c8862b190171122/python-can-4.0.0.tar.gz"
SRC_URI[md5sum] = "c8f91ec0856723eb41be012408870a9e"
SRC_URI[sha256sum] = "59d92846ffb981e634e9e0f2d14a6b4967a875e3869bd2ba168c92c4db6b8b5d"

S = "${WORKDIR}/python3-can-4.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
