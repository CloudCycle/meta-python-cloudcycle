
SUMMARY = "Style preserving TOML library"
HOMEPAGE = "https://github.com/sdispater/tomlkit"
AUTHOR = "Sébastien Eustace <sebastien@eustace.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/84/51/092a8b945edc3b93f2de091ab9596006673caac063e3fac14f0fa6c69b1c/tomlkit-0.11.4.tar.gz"
SRC_URI[md5sum] = "d0edd43143c7840deb88185685cea8dd"
SRC_URI[sha256sum] = "3235a9010fae54323e727c3ac06fb720752fe6635b3426e379daec60fbd44a83"

S = "${WORKDIR}/tomlkit-0.11.4"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
