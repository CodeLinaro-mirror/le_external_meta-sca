SUMMARY = "Use git repo data for building a version number according PEP-440"
HOMEPAGE = "https://github.com/dolfinus/setuptools-git-versioning"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92e79e3a844e66731724600f3ac9c0d8"

DEPENDS += "\
    python3-packaging-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "setuptools_git_versioning"

SRC_URI[sha256sum] = "612dfcf184addac9e1c2216f4f229724b2390e5bf613fb925ae80b84f2529172"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-packaging \
"
