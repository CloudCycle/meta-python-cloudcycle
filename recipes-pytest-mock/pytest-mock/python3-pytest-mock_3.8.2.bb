
SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
HOMEPAGE = "https://github.com/pytest-dev/pytest-mock/"
AUTHOR = "Bruno Oliveira <nicoddemus@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b2ddb1e69238461b7e4ef2a84d874109"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/b6/78/4094a83dcd41e94f4c7e830983aef9089aaf6b3412da600a566cb04de1a5/pytest-mock-3.8.2.tar.gz"
SRC_URI[md5sum] = "c46a7d64ae0745cc1b87a363e1bb473a"
SRC_URI[sha256sum] = "77f03f4554392558700295e05aed0b1096a20d4a60a4f3ddcde58b0c31c8fca2"

S = "${WORKDIR}/pytest-mock-3.8.2"

DEPENDS += " ${PYTHON_PN}-setuptools-scm-native"
RDEPENDS_${PN} = "python3-pytest"

BBCLASSEXTEND = "native nativesdk"
